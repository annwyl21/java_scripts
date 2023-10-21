import java.util.Random;
import java.util.Scanner;
// doing this will mean I don't need to type java.util to access the class inside the util package each time

public class GuessTheNumber {
    public static void main(String[] args) {
        // random number
        //java.util.Random rand = new java.util.Random(); // create a new instance of the Random class
        Random rand = new Random(); // simplified now we are using the import
        //System.out.println(rand.nextInt(100) + 1);// just specifying 100 gives us 0-99, no range gives us enormous numbers neg and pos, +1 gives us 1-100

        // user input capture
        Scanner scan = new Scanner(System.in);
        //int guess = scan.nextInt(); // call the function next int and store the return in the guess variable
        //System.out.println(guess);

        // loop control
        boolean gameContinue = true;

        // game
        int myNum = rand.nextInt(10) +1;
        while (gameContinue) {
            System.out.println("Enter a guess between 1 and 10:");
            int myGuess = scan.nextInt();
            if (myGuess < myNum) {
                System.out.println("Too Low");
            } else if (myGuess > myNum) {
                System.out.println("Too High");
            } else {
                System.out.println("Awesome!");
                gameContinue = false;
            }
        }
    }
}
