package algorithms.codinginterview;

import java.util.*;

/**
 * 10
 Alex
 Michael
 Harry
 Dave
 Michael
 Victor
 Harry
 Alex
 Mary
 Mary
 */

/**
 * Blackrock Hackerrank challenge
 */
public class HacklandElection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aLength = in.nextInt();
        String arr[] = new String[aLength];
        for(int i = 0; i < aLength; i++) {
            arr[i] = in.next();
        }
        electionWinner(arr);

    }

    static String electionWinner(String[] votes) {
        Map<String, Integer> voteMap = new HashMap<>();


        for(int i = 0; i < votes.length; i++) {
            int voteCount = 1;
            if(voteMap.containsKey(votes[i])) {
                voteMap.put(votes[i], voteMap.get(votes[i]) + 1);
            } else {
                voteMap.put(votes[i], voteCount);
            }
        }
        Map<String, Integer> treeMap = new TreeMap<>(voteMap);
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : treeMap.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0)
            {
                maxEntry = entry;
            }
        }

        String result =  maxEntry.getKey();

        return result;
    }
}
