package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.36
 * @Title Business application: checking ISBN
 */
public class Exercise4_36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer of nine digits: ");
        int number = input.nextInt();
        int d10 = 0;
        String ISBN = "";
        for (int i = 9; i > 0; i--) {
            int d = number % 10;
            number /= 10;
            d10 += (d * i);
            ISBN = d + ISBN;
        }
        d10 %= 11;
        ISBN = ISBN + d10;
        System.out.println("The ISBN is: " + ISBN);
    }
}
