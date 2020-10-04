package src.com.codeArena;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class Permu {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        // List<Integer> list = new ArrayList<>();
        // while(sc.hasNextInt()){
        //     list.add(sc.nextInt());
        // }\
        int[] P = new int[K];
        for(int i=0;i<K;i++){
            P[i]=sc.nextInt();
        }
        int[] Q = P;
        for(int i=0;i<K;i++ ){
            String kChar = sc.next();
            System.out.println("String:\t"+kChar);
            System.out.println("Char at "+i+"\t"+kChar.charAt(i));
            if(kChar.charAt(i+1)=='Y'){
                int m=P[i];
                int n=P[i+1];
                System.out.print("P before:\t");
                for(int a:P){
                    System.out.print("\t"+a);
                }
                P[m]=n;
                P[n]= m;
                System.out.print("P after:\t");
                for(int a:P){
                    System.out.print("\t"+a);
                }
                if(P[i]<Q[i]){
                    Q=P;
                }
            }
        }
        for (int i : Q) {
            System.out.print(i + " ");
        }
    }
}
