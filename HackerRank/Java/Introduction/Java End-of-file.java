import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(in.hasNext()) {
            ++i;
            System.out.println(i + " " + in.nextLine());
        }
    }
}