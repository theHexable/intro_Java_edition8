package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.17
 * @Title Counting characters, words, and lines in a file
 */
public class Exercise9_17 {

    static int counter = 0;
    static int wordsCounter = 0;
    static int lineCounter = 1;

    public static void main(String[] args) {
        String text = "Hello Mr.\nworld";
        numOfCharacters(text);
        System.out.println("Num of characters: "+counter);
        System.out.println("Num of words: "+wordsCounter);
        System.out.println("Num of lines: "+lineCounter);
    }

    public static void numOfCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\r') {
                continue;
            }
            if (text.charAt(i) == '\n') {
                wordsCounter++;
                lineCounter++;
                continue;
            }
            if (text.charAt(i) == ' ') {
                wordsCounter++;
            }
            counter++;
            if(counter == 1){
                wordsCounter++;
            }
        }
    }
}
