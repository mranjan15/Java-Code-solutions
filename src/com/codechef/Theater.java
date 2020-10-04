package src.com.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int sum=0;
        while (t!=0){
            int N = Integer.parseInt(br.readLine());
            Map<String, Map<Integer, Integer>> movieMap = new HashMap<>();
            List<String> movieList = Arrays.asList("A","B","C","D");
            List<Integer> timeList = Arrays.asList(12,3,6,9);
            movieList.forEach(movEle -> {
                HashMap<Integer, Integer> timeMap = new HashMap<>();
                for (Integer timeEle : timeList) {
                    timeMap.put(timeEle, 0);
                }
                movieMap.put(movEle, timeMap);
            });
            while (N!=0){
                String[] val = br.readLine().split(" ");
                String movieName = val[0];
                int movieTime = Integer.parseInt(val[1]);
                movieMap.get(movieName).put(movieTime,movieMap.get(movieName).get(movieTime)+1);
                N--;
            }
            System.out.println("\t3"+"\t6"+"\t9"+"\t12");
            movieMap.forEach((s, integerIntegerMap) -> {
                System.out.printf("\n%s",s);
                integerIntegerMap.forEach((integer, integer2) -> {
                    System.out.print("\t"+integer2);
                });
            });
            t--;
        }
    }
}
