import java . util . Scanner;
import java. util. Random;
public class NumberGussingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ranNum = new Random();

        int guess, TheRandNum, Attempts = 0;

        System.out.print("Guess a number between 1-10: ");
        guess = sc.nextInt();

        TheRandNum = ranNum.nextInt(1, 11);


        while(guess != TheRandNum){
            System.out.print("Enter a number: ");
            guess = sc.nextInt();
            Attempts++;

        }
        Attempts++;



        System.out.println("Congratulation! Your guess is correct :) ");
        System.out.print("Total attempt: "+Attempts);
        sc.close();
    }
}
