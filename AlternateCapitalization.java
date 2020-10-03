
/**
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.


 */
public class AlternateCapitalization {

    public static String[] capitalize(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(Character.toUpperCase(s.charAt(i)));
                odd.append(Character.toLowerCase(s.charAt(i)));
            } else {
                odd.append(Character.toUpperCase(s.charAt(i)));
                even.append(Character.toLowerCase(s.charAt(i)));

            }
        }
        String[] result = new String[2];
        result[0] = even.toString();
        result[1] = odd.toString();
        return result;
    }
}