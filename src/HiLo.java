import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        new GUI().build();
       /* Scanner scan = new Scanner(System.in);
        String playAgain;// = "";
        do {
            int guess_counts=1;
            int theNumber = (int)(Math.random() * 100 + 1);
// System.out.println(theNumber);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100:");
                System.out.println("Try # "+guess_counts);
                guess = scan.nextInt();

                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct. You win! It takes "+guess_counts+" counts.");
                guess_counts++;
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
            guess_counts=1;
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();*/
        //char test = (char) scan.nextByte();
        //System.out.println(test);
    }
}