package Chapter13.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 13.1B
 * @Title NumberFormatException
 */
public class Exercise13_01_VersionB {

    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;
        int input1 = 0, input2 = 0;
        if (!isNumeric(args[0])) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }
        if (!isNumeric(args[2])) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }
        input1 = Integer.parseInt(args[0]);
        input2 = Integer.parseInt(args[2]);

        // Determine the operator
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

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
