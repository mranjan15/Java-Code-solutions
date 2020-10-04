package src.com.codechef.may.lunchtime;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lostWeekends {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream( System.out );
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            List<String> inp = new LinkedList<>(Arrays.asList(br.readLine().split(" ")));
            int P = Integer.parseInt(inp.remove(5));
            int hrs= inp.stream().mapToInt(Integer::parseInt).sum();
            if (hrs*P>120) out.write(("Yes\n").getBytes());
            else out.write(("No\n").getBytes());
        }
        br.close();
        out.flush();
    }
}
