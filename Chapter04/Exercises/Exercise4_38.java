package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.38
 * @Title Decimal to hex
 */
public class Exercise4_38 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = scan.nextInt();
        String hex = "";
        int decimalNum = decimal;
        do {
            int hexValue = (decimalNum % 16);
            switch (hexValue) {
                case 10:
                    hexValue = 'A';
                    break;
                case 11:
                    hexValue = 'B';
                    break;
                case 12:
                    hexValue = 'C';
                    break;
                case 13:
                    hexValue = 'D';
                    break;
                case 14:
                    hexValue = 'E';
                    break;
                case 15:
                    hexValue = 'F';
                    break;
            }
            hex = ((hexValue > 9) ? ((char) hexValue + "") : hexValue) + hex;
            decimalNum /= 16;
        } while (decimalNum > 0);
        System.out.println(decimal + " in decimal = " + hex + " in hexadecimal");

    }
}
