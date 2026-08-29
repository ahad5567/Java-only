import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] Emoji = { "🍉", "🍋", "🍌", "🍓" };
        char again = 0;
        boolean run = true;
        int Amount = 100, Debt;
        System.out.println("Slot Machine");
        System.out.println("**************");

        do {
            System.out.println("Your Balance: " + Amount);
            System.out.print("Enter debt amount: ");
            Debt = sc.nextInt();
            sc.nextLine();
            if(Debt > 0 && Debt <= Amount){
                 int[] lol = new int[4];

            for (int i = 0; i < 4; i++) {
                lol[i] = random.nextInt(0, 4);
            }
            System.out.println("**************");
            System.out.println("Result: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(Emoji[lol[i]] + " ");
            }
            System.out.println();
            if (lol[0] == lol[1] && lol[0] == lol[2] && lol[0] == lol[3]) {
                Amount += Debt;
                System.out.println("Bravo! you win and your current balance: " + Amount);
                System.out.print("Wanna play again?[Y/n]: ");
                again = sc.next().charAt(0);
                System.out.println();
            } else {
                Amount -= Debt;

                if (Amount <= 0) {
                    System.out.println("You lose and cannot continue because your balance is 0");
                    run = false;
                } else {
                    System.out.println("Damn! you lose and your balance is " + Amount);
                    System.out.print("Wanna play again?[Y/n]: ");
                    again = sc.next().charAt(0);

                }

            }

            }else{
                System.out.print("To re-enter a vaild debt press Y else press n to exit: ");
                again = sc.next().charAt(0);
            }
           

        } while (again == 'Y' && run);

        System.out.println("Thank you, come again. :)");

        sc.close();

    }
}