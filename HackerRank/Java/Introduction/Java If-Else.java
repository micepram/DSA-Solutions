import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String message = "";
        if(N % 2 != 0 || (N % 2 == 0 && 6 <= N && N <= 20))
            message = "Weird";
        else if((2 <= N && N <= 5) || N > 20)
            message = "Not Weird";
        System.out.println(message);
    }
}
