package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.29
 * @Title New string split method
 */
public class Exercise09_29 {

    public static void main(String[] args) {
        String[] statements = split("a?b?gf#e", "[?#]");
        for (int i = 0; i < statements.length; i++) {
            System.out.println(statements[i]);
        }
    }

    public static String[] split(String s, String regex) {
        int numOfPieces = 0;
        int numOfDelimeters = 0;
        String[] statements;
        char[] delimeters = null;
        if (regex.length() > 1) {
            if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
                delimeters = new char[regex.length() - 2];
                for (int i = 0; i < delimeters.length; i++) {
                    delimeters[i] = regex.charAt(i + 1);
                }
            }
        } else {
            delimeters = new char[1];
            delimeters[0] = regex.charAt(0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (isDelimeter(delimeters, s.charAt(i))) {
                numOfDelimeters++;
            }
        }
        numOfPieces = numOfDelimeters * 2 + 1;
        statements = new String[numOfPieces];
        String stat = "";
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (!isDelimeter(delimeters, character)) {
                stat = stat.concat(String.valueOf(character));
            } else if (isDelimeter(delimeters, character)) {
                statements[statements.length - numOfPieces] = stat;
                numOfPieces--;
                stat = "";
                statements[statements.length - numOfPieces] = String.valueOf(character);
                numOfPieces--;
            }
        }
        statements[statements.length - numOfPieces] = stat;
        return statements;
    }

    private static boolean isDelimeter(char[] delimeters, char character) {
        for (int i = 0; i < delimeters.length; i++) {
            if (delimeters[i] == character) {
                return true;
            }
        }
        return false;
    }
}
