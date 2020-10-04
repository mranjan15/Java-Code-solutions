package src.com.codechef;/* package src.codechef.codechef; // don't place package name! */

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
    static int[] num_to_bits = new int[] { 0, 1, 1, 2, 1, 2, 2,
            3, 1, 2, 2, 3, 2, 3, 3, 4 };

    static int countSetBitsRec(int num)
    {
        if (0 == num)
            return num_to_bits[0];

        return num_to_bits[num & 0xf] + countSetBitsRec(num >> 4);
    }
    static boolean get1s0s(int num){
        if (0 == (countSetBitsRec(num)) % 2) return true;
        else return false;
    }

    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream ( System.out );
        int t = Integer.parseInt(br.readLine());
        while (0 != t){
            String[] NQ = br.readLine().split(" ");
            String[] A = br.readLine().split(" ");
            for (int i = Integer.parseInt(NQ[1]); i>0; i--) {
                int p = Integer.parseInt(br.readLine());
                int N =Integer.parseInt(NQ[0]);
                int M = N/2;
                int o=0,e =0;
                for (int j = N-1; j >=M ; j--) {
                    if (get1s0s(Integer.parseInt(A[j]) ^ p)) e += 1;
                    else o += 1;
                    if (get1s0s(Integer.parseInt(A[N-1-j]) ^ p)) e += 1;
                    else o += 1;
                }
                if (N%2!=0){
                    if (get1s0s(Integer.parseInt(A[M]) ^ p)) e += 1;
                    else o += 1;
                }
                out.write((e+" "+o+"\n").getBytes());
            }
            t--;
        }
        br.close();
        out.flush();
    }
}
