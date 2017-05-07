package Chapter02.Exercises;

/**
 *
 * @author Shady
 * @Exercise 2.19 - Random character
 */
public class Exercise2_19 {/**
 * We know the last Upper case letter has ASCII code 91
 * and the first Uppercase letter has ASCII code 65
 * System.currentTimeMillis() method return long number
 * so the number must be between 65 and 91, how ?
 * firstly get number less than 26 = 91 -65;
 * then add 65 to that number
 * using this way we guaranteed the number will be between
 * 56 and 91
 * 
 * @param args 
 */
    public static void main(String[] args) {
        long randomNumber = System.currentTimeMillis();
        // Get number less than 26
        randomNumber = randomNumber % 26;
        
        // add 65 to the number
        randomNumber += 65;
        System.out.println((char) randomNumber);
    }
}
