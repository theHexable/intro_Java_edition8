package Chapter10.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.3
 * @Title MyInteger class
 */
public class Exercise10_03 {

    public static void main(String[] args) {
        System.out.println("12056");
    }
}

class MyInteger {

    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        for (int i = this.value / 2; i > 1; i--) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public static boolean isPrime(int value) {
        for (int i = value / 2; i > 1; i--) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger mi) {
        return mi.isEven();
    }

    public static boolean isOdd(MyInteger mi) {
        return mi.isOdd();
    }

    public static boolean isPrime(MyInteger mi) {
        return mi.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger mi) {
        return this.value == mi.getValue();
    }

    public static int parseInt(char[] characters) {
        int value = 0;
        for (int i = 0; i < characters.length; i++) {
            value += characters[i] * Math.pow(10, characters.length - i - 1);
        }
        System.out.println(value);
        return value;
    }

    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            value += str.charAt(i) * Math.pow(10, str.length() - i - 1);
        }
        System.out.println(value);
        return value;
    }
}
