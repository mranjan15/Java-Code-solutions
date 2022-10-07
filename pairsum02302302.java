import java.util.*;
public class pairsum{
    // 2 pointer apporach
    public static boolean pairsumm(ArrayList<Integer> list , int target){
        int lp = 0 ;
        int rp = list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        int target = 5;

        System.out.print(pairsumm(list1,target));
    }
}