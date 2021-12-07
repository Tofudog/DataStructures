import java.util.Scanner;
import java.util.Random;

public class numberGuesser {

    private int numCorrect;

    public numberGuesser() {

    }

    // public closestNumber()

    public void generateNum(int low, int high) {
        System.out.print("Guess a number from " + low + " to " + high + ": ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        Random random = new Random();
        int rand = random.nextInt(high) + low;
        System.out.println("Actual number: " + rand);
    }


    public static void main(String[] args) {
        numberGuesser guesser = new numberGuesser();
        guesser.generateNum(1, 10);
    }

}
