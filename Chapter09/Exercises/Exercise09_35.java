package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.35
 * @Title Bioinformatics: finding genes
 * @source
 * https://nav4bioinfo.wordpress.com/2013/06/09/solved-bioinformatics-finding-genes-biologists-use-a-sequence-of-letters-a-c-t-and-g-to-model-a-genome/
 */
public class Exercise09_35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();
        boolean found = false;
        int start = -1;
        for (int i = 0; i < genome.length() - 2; i++) {
            String triplet = genome.substring(i, i + 3);
            if (triplet.equals("ATG")) {
                start = i + 3;
            } else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA")))
                    && (start != -1)) {
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0) {
                    found = true;
                    System.out.println(gene);
                    start = -1;
                }
            }
        }
        if (!found) {
            System.out.println("no gene is found");
        }
    }
}