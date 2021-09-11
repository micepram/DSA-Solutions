import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next(), reverse = "";
        char chr[] = A.toCharArray();
        for(int i = chr.length - 1; i >= 0; i--)
            reverse += chr[i];
        if(reverse.compareTo(A) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



