import java.util.ArrayList;
import java.util.Collections;

public class Encryption {
    public String encrypt(String message) {

        ArrayList<Character> alph = new ArrayList<>();
        for (char m = 'a'; m <= 'z' ; m ++) {
            alph.add(m);
        }

        char[] messageArr = message.toCharArray();
        ArrayList<Character> messageList = new ArrayList<>();
        for (char m : messageArr) {
            if (messageList.contains(m) == false) {
                messageList.add(m);
            }
        }

        String ret = "";
        for (char n : messageArr) {
            ret += alph.get(messageList.indexOf(n));
        }


    return ret;
    }

    public static void main(String [] args) {

        Encryption Test = new Encryption();

        String message = "topcoder";

        String ret = Test.encrypt(message);

        System.out.print(ret);
    }
}