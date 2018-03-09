package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.5
 * @Title Sorting three numbers
 */
public class Exercise5_05 {

    public static void main(String[] args) {
        displaySortedNumbers(5, 6, 4);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        System.out.println("The numbers " + num1 + ", " + num2 + ", "
                + num3 + " are sorted: ");
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }
}
