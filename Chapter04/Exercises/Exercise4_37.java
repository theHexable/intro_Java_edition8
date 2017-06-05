package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.37
 * @Title Decimal to Binary
 */
public class Exercise4_37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = scan.nextInt();
        String binary = "";
        int decimalNum = decimal;
        do {
            binary = (decimalNum % 2) + binary;
            decimalNum /= 2;
        } while (decimalNum > 0);
        System.out.println(decimal + " in decimal = " + binary + " in binary");
    }
}
