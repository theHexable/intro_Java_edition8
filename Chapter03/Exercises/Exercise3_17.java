package Chapter03.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 3.17
 * @Title Game: scissor,rock, paper
 */
public class Exercise3_17 {

    public static void main(String[] args) {
        int machineChoice = (int) (Math.random() * 3);

        // Read user choice from console
        Scanner input = new Scanner(System.in);
        System.out.print("scissor(0), rock(1), paper(2): ");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 0:
                switch (machineChoice) {
                    case 0:
                        System.out.println("The computer is scissor. You are scissor too. It is draw");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are scissor. You lost");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are scissor. You won");
                        break;
                }
                break;
            case 1:
                switch (machineChoice) {
                    case 0:
                        System.out.println("The computer is scissor. You are rock. You won");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are rock too. It is draw");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are rock. You lost");
                        break;
                }
                break;
            case 2:
                switch (machineChoice) {
                    case 0:
                        System.out.println("The computer is scissor. You are paper. You lost");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are paper. You lost");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are paper too. It is draw");
                        break;
                }
                break;
        }
    }
}
