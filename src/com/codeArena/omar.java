package src.com.codeArena;

import java.util.HashMap;
import java.util.Scanner;

public class omar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        int i=0;
        HashMap<Character, Integer> hMap= new HashMap<>();
        int a=97;
        while (a<=122){
            char c=(char)a;
            hMap.put(c,1);
            a++;
        }
        while(i<t){
            String word = sc.next();
            String[] wordArray;
            wordArray = word.split("");
            for (String temp: wordArray){
                System.out.print(temp+"\t");
            }
            i++;
        }

    }
}
