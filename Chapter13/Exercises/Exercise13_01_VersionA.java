package Chapter13.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.1
 * @Title NumberFormatException
 */
public class Exercise13_01_VersionA {

    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        int input1 = 0, input2 = 0;
        try {
            input1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }
        try {
            input2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[2]);
            System.exit(0);
        }

        switch (args[1].charAt(0)) {
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            case '/':
                result = input1 / input2;
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

}
