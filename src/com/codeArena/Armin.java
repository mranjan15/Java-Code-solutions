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

class Armin {
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
        String[] ar = sc.nextLine().split(" ");
        int N= Integer.parseInt(ar[0]);
        int M= Integer.parseInt(ar[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <M ; i++) {
            String[] bld =sc.nextLine().split(" ");
            map.put(Integer.parseInt(bld[0]+bld[1]), Integer.valueOf(bld[2]));
        }
        String[] ref = sc.nextLine().split(" ");
        int S = Integer.parseInt(ref[0]);
        int A = Integer.parseInt(ref[1]);
        int H = Integer.parseInt(ref[2]);
        int groups=0;
        if (S==A&&S==H){
            groups=N-1;
        } else if(S==A||S==H||A==H){
            groups=N-2;
        } else {
            groups=N-3;
        }

    }
}
