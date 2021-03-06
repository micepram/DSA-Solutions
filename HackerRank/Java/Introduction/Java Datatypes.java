import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            try {
                long x = in.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x <= 127 && x >= -128)
                    System.out.println("* byte \n* short \n* int \n* long");
                else if(x <= 32767 && x >= -32768)
                    System.out.println("* short \n* int \n* long");
                else if (x <= 2147483647 && x >= -2147483648)
                    System.out.println("* int \n* long");
                else if(x <= 9223372036854775807l && x >= -9223372036854775808l)
                    System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }
    }
}



