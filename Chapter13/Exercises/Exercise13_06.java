package Chapter13.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.6
 * @Title NumberFormatException
 */
public class Exercise13_06 {

    public static void main(String[] args) {
        System.out.println(parseHex("A5"));
        System.out.println(parseHex("FAA"));
        System.out.println(parseHex("T10"));
        System.out.println(parseHex("ABC"));
        System.out.println(parseHex("10A"));
    }

    public static int parseHex(String hexString) {
        int value = convertHexToDec(hexString.charAt(0));
        for (int i = 1; i < hexString.length(); i++) {
            value = value * 16 + hexString.charAt(i) - '0';
        }

        return value;
    }

    static int convertHexToDec(char ch) {
        if (ch == 'A') {
            return 10;
        } else if (ch == 'B') {
            return 11;
        } else if (ch == 'C') {
            return 12;
        } else if (ch == 'D') {
            return 13;
        } else if (ch == 'E') {
            return 14;
        } else if (ch == 'F') {
            return 15;
        } else if (ch <= '9' && ch >= '0') {
            return ch - '0';
        } else {
            throw new NumberFormatException("Illegal character: " + ch);
        }
    }
}