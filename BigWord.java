import java.util.ArrayList;

public class BigWord {
    public String most(String[] sentences) {

        ArrayList<String> words = new ArrayList<>();
        int[] counts = new int[1250];

        for (String s: sentences) {
            String[] sList = s.toLowerCase().split(" ");
            for (String w : sList) {
                if (words.contains(w) == false) {
                    words.add(w);
                }
                counts[words.indexOf(w)]++;
            }
        }

        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                indexMax = i;
            }
        }

        String ret = words.get(indexMax);

        return ret;

    }

    public static void main(String [] args) {

        BigWord Test = new BigWord();

        String[] sentences = {"This is the way", "This is the way", "this is this"};

        String ret = Test.most(sentences);

        System.out.print(ret);
    }
}