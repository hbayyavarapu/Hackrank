package algorithms.warmup;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());

    }
}
