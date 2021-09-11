import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String in = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String cn = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + cn);
        System.out.println("France: " + fr);
    }
}
