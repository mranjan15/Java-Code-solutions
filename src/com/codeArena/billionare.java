package src.com.codeArena;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class billionare {
    public static void main(String args[] ) throws Exception {


        // Write your code here
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        int t=1;
        System.out.printf(String.valueOf(t));
//        int[] drA = new int[t];
        for (int i = 0; i <t ; i++) {
            int n = sc.nextInt();
            if (n==0){
                throw new ArithmeticException("zero");
            } else {
//                System.out.println("\n"+n);
                double pf1 = ((double)1/n); //probability
//                System.out.format("\n%.6f", pf1 );
                double pf = 1-pf1;
//                System.out.format("\n%.6f", pf );
            }
        }
    }
}

