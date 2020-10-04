package src.com.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class snugFit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t!=0){
            int N = Integer.parseInt(br.readLine());
            List<Integer> A =  convertArrayToList(br.readLine().split(" "));
            List<Integer> B = convertArrayToList(br.readLine().split(" "));
            int S = getRectangle(A, B, N);
            System.out.printf("\n%d", S);
            t--;
        }
        br.close();
    }

    private static int getRectangle(List<Integer> a, List<Integer> b, int n) {
        int sum =0;
        for (int i = 0; i <n ; i++) {
            int A =a.get(i);
            int B =b.get(i);
//            System.out.printf(String.format("\n%dX%d", +A, B));
            if (A<=B){
                sum=sum+A;
            } else {
                sum =sum+B;
            }
        }
        return sum;
    }

    private static List<Integer> convertArrayToList(String[] strAry){
        List<Integer> list = new ArrayList<>();
        for (String t :strAry) list.add(Integer.valueOf(t));
        list.sort(Integer::compareTo);
        return list;
    }
}
