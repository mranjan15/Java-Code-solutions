package src.com.codeArena;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            read(s);
        }

    }
    static void read(Scanner s){
        String[] arr=s.nextLine().split(" ");
        int MOD=1000000007;
        int[] intarr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        int N=intarr[0];
        int K=intarr[1];
        // int[] reArray = new int[K];
        int sum=0;
        int n=1;
        factorial fc = new factorial();     //factorial
        while (n<=K) {
            // reArray[n] = npr(N,K)
            System.out.println("r: "+n);
            sum=sum+fc.nPr(N,n);
            System.out.println("sum: "+sum);
            n++;
        }
        // int result = npr(N,K);
        System.out.println(sum%MOD);
    }
}
