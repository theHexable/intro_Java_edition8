package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.9
 * @Title binary to hex
 */
public class Exercise9_9 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Binary number: ");
//        String binaryString = scan.nextLine();
//        System.out.println("Decimal number is: " + binaryToDecimal(binaryString));
        System.out.println(decimalCharToHex('2'));
    }

//    public static String binaryToHex(String binaryValue) {
//        
//    }
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimal += (binaryString.charAt(i) == '1')
                    ? Double.parseDouble("" + Math.pow(2, binaryString.length() - 1 - i)) : 0;
        }
        return decimal;
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
//            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static char decimalCharToHex(char num) {
        if (num >= 10 && num <= 15) {
            return (char) (num - 10 + 'A');
        } else // ch is '0', '1', ..., or '9'
        {
            System.out.println(num - '2');
            return (char)((int)num - '2');
            
        }
    }
}
