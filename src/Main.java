import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int computerRandom = random.nextInt(3) + 1;
        String computerInput;
        
        System.out.println("Enter Rock, Paper or Scissor ");
        String userInput = scanner.nextLine().toUpperCase();
        
        scanner.close();
        
        if (computerRandom == 1) {
            computerInput = "ROCK";
            if (userInput.equals("ROCK")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("Match drawn ");
            } else if (userInput.equals("PAPER")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU WIN ");
            } else if (userInput.equals("SCISSOR")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU lose ");
            } else {
            	System.out.println("Input Rock, Paper or Scissor");
            }
        } else if (computerRandom == 2) {
            computerInput = "PAPER";
            if (userInput.equals("PAPER")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("Match drawn ");
            } else if (userInput.equals("SCISSOR")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU WIN ");
            } else if (userInput.equals("ROCK")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU lose ");
            } else {
            	System.out.println("Input Rock, Paper or Scissor");
            }
        } else {
            computerInput = "SCISSOR";
            if (userInput.equals("SCISSOR")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("Match drawn ");
            } else if (userInput.equals("ROCK")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU WIN ");
            } else if (userInput.equals("PAPER")) {
                System.out.println("Your Input Is : " + userInput);
                System.out.println("Computer Input Is : " + computerInput);
                System.out.println("YOU lose ");
            } else {
            	System.out.println("Input Rock, Paper or Scissor");
            }
        }
    }
}
