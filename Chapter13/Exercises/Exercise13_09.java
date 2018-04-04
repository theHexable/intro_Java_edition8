package Chapter13.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.9
 * @Title BinaryFormatException
 */
public class Exercise13_09 {

    public static void main(String[] args) throws BinaryFormatException {
        System.out.println(binaryToDecimal("101"));
        System.out.println(binaryToDecimal("111"));
        System.out.println(binaryToDecimal("113"));
    }

    public static int binaryToDecimal(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            switch (binaryString.charAt(i)) {
                case '1':
                    decimal += Double.parseDouble("" + Math.pow(2, binaryString.length() - 1 - i));
                    break;
                case '0':
                    break;
                default:
                    throw new NumberFormatException("Illegal character: " + binaryString.charAt(i));
            }
        }
        return decimal;
    }
}

class BinaryFormatException extends Exception {

    BinaryFormatException() {
        super("Illegal binary character");
    }

    BinaryFormatException(String message) {
        super(message);
    }
}
