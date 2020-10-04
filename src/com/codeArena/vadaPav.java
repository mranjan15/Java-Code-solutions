package src.com.codeArena;

import java.util.HashSet;
import java.util.Scanner;

public class vadaPav {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> namesSet = new HashSet<>();
        int x =0;
        while (x<N){
            String name = sc.next();
            namesSet.add(name);
            x++;
        }
        int n = namesSet.size();
        String[] namesArray = new String[n];
        String[] words = new String[n];
        namesSet.toArray(namesArray);
        for(int i = 0; i < n-1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (namesArray[i].compareTo(namesArray[j]) > 0) {
                    String temp = namesArray[i];
                    namesArray[i] = namesArray[j];
                    namesArray[j] = temp;
                }
            }
        }
        System.out.println(n);
        for(String temp : namesArray){
            System.out.println("\n"+temp);
        }
    }
}
