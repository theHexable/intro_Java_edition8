package Chapter04.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 4.34
 * @Title Game: Scissor, Rock, Paper
 */
public class Exercise4_34 {

    public static void main(String[] args) {
        int userWinCounter = 0, computerWinCounter = 0;

        // Read user choice from console
        Scanner input = new Scanner(System.in);
        do {
            int machineChoice = (int) (Math.random() * 3);
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
                            computerWinCounter++;
                            break;
                        case 2:
                            System.out.println("The computer is paper. You are scissor. You won");
                            userWinCounter++;
                            break;
                    }
                    break;
                case 1:
                    switch (machineChoice) {
                        case 0:
                            System.out.println("The computer is scissor. You are rock. You won");
                            userWinCounter++;
                            break;
                        case 1:
                            System.out.println("The computer is rock. You are rock too. It is draw");
                            break;
                        case 2:
                            System.out.println("The computer is paper. You are rock. You lost");
                            computerWinCounter++;
                            break;
                    }
                    break;
                case 2:
                    switch (machineChoice) {
                        case 0:
                            System.out.println("The computer is scissor. You are paper. You lost");
                            computerWinCounter++;
                            break;
                        case 1:
                            System.out.println("The computer is rock. You are paper. You won");
                            userWinCounter++;
                            break;
                        case 2:
                            System.out.println("The computer is paper. You are paper too. It is draw");
                            break;
                    }
                    break;
            }
        } while (computerWinCounter != 2 && userWinCounter != 2);
    }
}
