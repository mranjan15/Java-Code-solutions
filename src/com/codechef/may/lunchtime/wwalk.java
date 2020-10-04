package src.com.codechef.may.lunchtime;

import java.io.*;

public class wwalk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream( System.out );
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            int N = Integer.parseInt(br.readLine());
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");
            int Ax=0,Bx=0;
            long wdist=0;
            for (int i = 0; i < N; i++){
                int ai=Integer.parseInt(A[i]);
                int bi=Integer.parseInt(B[i]);
                if(Ax==Bx && ai==bi ) wdist += ai;
                Ax=Ax+ai;
                Bx=Bx+bi;
            }
            out.write((wdist+"\n").getBytes());
        }
        br.close();
        out.flush();
    }
}
