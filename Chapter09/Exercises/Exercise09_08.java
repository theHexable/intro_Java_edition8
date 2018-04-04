package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.8
 * @Title Binary to Decimal
 */
public class Exercise9_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        String binaryString = scan.nextLine();
        System.out.println("Decimal number is: " + binaryToDecimal(binaryString));
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimal += (binaryString.charAt(i) == '1')
                    ? Double.parseDouble("" + Math.pow(2, binaryString.length() - 1 - i)) : 0;
        }
        return decimal;
    }
}
