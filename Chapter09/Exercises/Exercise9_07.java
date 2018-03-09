package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.7
 * @Title Phone Keypads
 */
public class Exercise9_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scan.nextLine();
        string = string.toUpperCase();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int num = getNumber(string.charAt(i));
            if (num<= 9) {
                number.append(num);
            }else{
                number.append((char)num);
            }
        }
        System.out.println(number.toString());
    }

    public static int getNumber(char uppercaseLetter) {
        int value = -1;
        switch (uppercaseLetter) {
            case '1':
                value = 1;
                break;
            case '2':
            case 'A':
            case 'B':
            case 'C':
                value = 2;
                break;
            case '3':
            case 'D':
            case 'E':
            case 'F':
                value = 3;
                break;
            case '4':
            case 'G':
            case 'H':
            case 'I':
                value = 4;
                break;
            case '5':
            case 'J':
            case 'K':
            case 'L':
                value = 5;
                break;
            case '6':
            case 'M':
            case 'N':
            case 'O':
                value = 6;
                break;
            case '7':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                value = 7;
                break;
            case '8':
            case 'T':
            case 'U':
            case 'V':
                value = 8;
                break;
            case '9':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                value = 9;
                break;
            case '0':
                value = 0;
                break;
            default:
                return uppercaseLetter;
        }
        return value;
    }
}
