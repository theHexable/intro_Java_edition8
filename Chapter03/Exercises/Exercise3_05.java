package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.5
 * @Title Addition for three numbers
 */
public class Exercise3_05 {

    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);
        
        //create three single digit integers randomly
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() * 5 % 10);
        int number3 = (int) (System.currentTimeMillis() * 7 % 10);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int answer = input.nextInt();
        System.out.println(number1 + " + " + " + " + number2 + " + " + number3 + " = " + answer + " is "
                + (number1 + number2 + number3 == answer));

    }
}
