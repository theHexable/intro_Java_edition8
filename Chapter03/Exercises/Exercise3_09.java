package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.9
 * @Title Business: checking ISBN
 */
public class Exercise3_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer of nine digits: ");
        int number = input.nextInt();
        
        int d9 = number % 10;
        number = number / 10;
        int d8 = number % 10;
        number = number / 10;
        int d7 = number % 10;
        number = number / 10;
        int d6 = number % 10;
        number = number / 10;
        int d5 = number % 10;
        number = number / 10;
        int d4 = number % 10;
        number = number / 10;
        int d3 = number % 10;
        number = number / 10;
        int d2 = number % 10;
        number = number / 10;
        int d1 = number % 10;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("the ISBN is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + "");
    }
}
