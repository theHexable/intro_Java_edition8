package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.25
 * @Title Implementing the Character class
 */
public class Exercise09_25 {
}

class MyCharacter {

    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return this.value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        return value - anotherCharacter.value;
    }

    public boolean equals(MyCharacter anotherCharacter) {
        return value == anotherCharacter.value;
    }

    public static boolean isDigit(char ch) {
        return ch <= '9' && ch >= 'a';
    }

    public static boolean isLetter(char ch) {
        return (ch <= 'z' && ch >= 'a')
                || (ch <= 'Z' && ch >= 'A');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    public static boolean isLowerCase(char ch) {
        return (ch <= 'z' && ch >= 'a');
    }

    public static boolean isUpperCase(char ch) {
        return (ch <= 'Z' && ch >= 'A');
    }

    public static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char) (ch - 'a' + 'A');
        } else {
            return ch;
        }
    }

    public static char toLowerCase(char ch) {
        if (isUpperCase(ch)) {
            return (char) (ch - 'A' + 'a');
        } else {
            return ch;
        }
    }
}
