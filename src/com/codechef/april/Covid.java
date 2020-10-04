package src.com.codechef.april;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Covid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream( System.out );
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            int N = Integer.parseInt(br.readLine());
            List<String> intSeq = Arrays.asList(br.readLine().split(" "));
            List<Integer> indexs = new ArrayList<>();
            boolean isSafe = true;
            for (int i = 0; i < intSeq.size(); i++) {
                if ("1".equals(intSeq.get(i))) {
                    indexs.add(i);
                    try {
                        isSafe= (i - indexs.get(indexs.size() - 2)) >= 6;
                    } catch (Exception e){
                        isSafe=true;
                    }
                }
            }
            if (isSafe) out.write(("YES\n").getBytes());
            else out.write(("NO\n").getBytes());
        }
        br.close();
        out.close();
    }
}
