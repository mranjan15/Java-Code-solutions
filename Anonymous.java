import java.util.ArrayList;
import java.util.HashSet;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        int[] numLetters = getCounts(headlines);

        for (int i = 0; i < messages.length; i++) {
            String[] wordList = messages[i].split(" ", 0);
            int[] toWrite = getCounts(wordList);// wordlist = give, me, my, money, back

            ArrayList<Character> present = new ArrayList<>();
            toCharlist(wordList, present);
            ArrayList<Character> possible = new ArrayList<>();

            for (int j = 0; j < present.size(); j++) {
                if (toWrite[present.get(j)] <= numLetters[present.get(j)]) {
                    possible.add(present.get(j));
                }

            }

            if (possible.size() == present.size()) {
                count ++;
            }
            //create a hash set containing all chars in that message
            //loop through the chars and check if the num there is <=
            // if it is, add that ch to array
            // at the end of that loop, if length of array = length of set, count ++

        }
        return count;
    }

    private void toCharlist(String[] strings, ArrayList set) {
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                set.add(ch);
            }
        }
    }

    private int[] getCounts(String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
        return counts;
    }

    public static void main(String [] args) {

        Anonymous Test = new Anonymous();

        String[] headlines =

                {"Earthquake in San Francisco",
                        "Burglary at musuem in Sweden",
                        "Poverty"};
        String[] messages =

                {"Give me my money back",
                        "I am the best coder",
                        "TOPCODER"};

        int ret = Test.howMany(headlines, messages);

        System.out.println(ret);
    }


}