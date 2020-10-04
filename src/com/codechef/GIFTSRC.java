package src.com.codechef;

import java.io.*;
import java.util.*;

public class GIFTSRC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream( System.out );
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            int N = Integer.parseInt(br.readLine());
            int x=0,y=0;
            String instructions = br.readLine();
            String[] instructionArray = instructions.split("");
            List<String> instructionList = Arrays.asList(instructionArray);
            Map<String, String> rule = new HashMap<>();
            rule.put("L","X");
            rule.put("R","X");
            rule.put("U","Y");
            rule.put("D","Y");
            Iterator<String> it = instructionList.iterator();
            String previous = null;
            while (it.hasNext()){
                String instruction = (String) it.next();
                if (!rule.get(instruction).equals(previous)){
                    switch (instruction){
                        case "L":
                            x+=-1;
                            break;
                        case "R":
                            x+=1;
                            break;
                        case "U":
                            y+=1;
                            break;
                        case "D":
                            y+=-1;
                            break;
                        default:
                            break;
                    }
                    previous=rule.get(instruction);
                }
            }
            out.write((x+" "+y+"\n").getBytes());
        }
        br.close();
        out.flush();
    }
}
