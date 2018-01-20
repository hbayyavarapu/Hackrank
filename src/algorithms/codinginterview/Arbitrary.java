package algorithms.codinginterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Blackrock Hackerrank coding challenge
 *
 */
public class Arbitrary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            int[] res;

            int _quotes_size = 0;
            _quotes_size = Integer.parseInt(in.nextLine().trim());
            String[] _quotes = new String[_quotes_size];
            String _quotes_item;
            for (int _quotes_i = 0; _quotes_i < _quotes_size; _quotes_i++) {
                try {
                    _quotes_item = in.nextLine();
                } catch (Exception e) {
                    _quotes_item = null;
                }
                _quotes[_quotes_i] = _quotes_item;
            }

            res = arbitrage(_quotes);
            try {
                for (int res_i = 0; res_i < res.length; res_i++) {
                    bw.write(String.valueOf(res[res_i]));
                    bw.newLine();
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch(Exception e) {

        }

    }

    static int[] arbitrage(String[] quotes) {
        List<Integer> profitList = new ArrayList<>();
        List<String[]> quoteList = new ArrayList<>();
        String[] quote = new String[3];
        for(int i = 0; i < quotes.length; i++) {
            quote = quotes[i].split(" ");
            quoteList.add(quote);
        }

        for(String[] str: quoteList) {
            int totalInvestment = 100000;
            double usdToEur = totalInvestment/Double.valueOf(str[0]);
            double eurToGbp = usdToEur/Double.valueOf(str[1]);
            double gbpToUsd = eurToGbp/Double.valueOf(str[2]);
            int profit = new Double(gbpToUsd).intValue() - totalInvestment;
            if(profit > 0) {
                profitList.add(profit);
            } else {
                profitList.add(0);
            }
        }

        int[] profitArray = new int[profitList.size()];
        int i = 0;
        for(int arr: profitList) {
            profitArray[i] = arr;
            i++;
        }

        return profitArray;

    }
}
