package src.com.codechef;/* package src.codechef.codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pintu
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t!=0){
            List<Integer> NM = convertArrayToList(br.readLine().split(" "));
//            int N = NM.get(0);
//            int M = NM.get(1);
            List<Integer> A =  convertArrayToList(br.readLine().split(" "));
            List<Integer> B = convertArrayToList(br.readLine().split(" "));
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < NM.get(0); i++) {
                int f = A.get(i);
                int p = B.get(i);
                if (map.containsKey(f)) map.put(f, map.get(f) + p);
                else map.put(f, p);
            }
            System.out.println(Collections.min(map.values()));
            t--;
        }
        br.close();
    }

    private static List<Integer> convertArrayToList(String[] strAry){
        List<Integer> list = new ArrayList<>();
        for (String t :strAry) {
            list.add(Integer.valueOf(t));
        }
//        list.sort(Integer::compareTo);
        return list;
    }
}
