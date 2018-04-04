package Chapter05.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 5.23
 * @Title Generating random characters
 */
public class Exercise5_23 {

    public static void main(String[] args) {
        System.out.println("100 UpperCase characters: ");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%2c ", getRandomUpperCaseLetter());
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("100 Sigle Digits: ");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%2c ", getRandomDigitCharacter());
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    /* Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /* Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /* Generate a random digit character*/
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

}
