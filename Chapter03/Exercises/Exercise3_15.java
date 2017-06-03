package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.15
 * @Title Game: Lottery
 * @recommended: Yes ! good for new learners
 */
public class Exercise3_15 {

    public static void main(String[] args) {
        // Generate random number of three digits
        int number = 100 + (int) (Math.random() * 900);
        int machineD1 = number % 10;
        int machineD2 = (number / 10) % 10;
        int machineD3 = number / 100;
        System.out.println(number);
        // Input user number of three digits
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer of three digits: ");
        int userNumber = input.nextInt();

        if (number == userNumber) {
            System.out.println("The numbers are matching exactly. You win $10,000");
        } else {
            /*
                There is two situations
                1. Same numbers in different positions, will recognize them using
                    two common properties 
                    1.1- The sum of three digits in the two numbers are equal
                    1.2- Every digit in the user number must be found in the 
                        machine number (if one number has the same digit e.g 333,
                        999, 555, 556, 858,... this property will protect it from
                        error)
                2. One digit matching
             */
            int userD1 = userNumber % 10;
            int userD2 = (userNumber / 10) % 10;
            int userD3 = userNumber / 100;
            if ((machineD1 + machineD2 + machineD3 == userD1 + userD2 + userD3)
                    && (userD1 == machineD1 || userD1 == machineD2 || userD1 == machineD3)
                    && (userD2 == machineD1 || userD2 == machineD2 || userD2 == machineD3)
                    && (userD3 == machineD1 || userD3 == machineD2 || userD3 == machineD3)) {
                System.out.println("Matching digits with different positions. You win $3,000");
            } else if (userD1 == machineD1 || userD1 == machineD2 || userD1 == machineD3
                    || userD2 == machineD1 || userD2 == machineD2 || userD2 == machineD3
                    || userD3 == machineD1 || userD3 == machineD2 || userD3 == machineD3) {
                System.out.println("One digit matching. You win $1,000");
            } else {
                System.out.println("There is no matching. You are lost.");
            }
        }

    }
}
