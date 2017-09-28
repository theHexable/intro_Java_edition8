package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.10
 * @Title Decimal to Binary
 */
public class Exercise9_10 {

    public static void main(String[] args) {

    }

    public static String decimalToBinary(int value) {
        String binaryString = "";
        int binary[] = new int[40];
        int index = 0;
        while (value > 0) {
            binary[index++] = value % 2;
            value = value / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            binaryString += (binary[i]);
        }
        return binaryString;
    }
}
