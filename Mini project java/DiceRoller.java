import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ranNum = new Random();
        int Dice, total = 0;

        System.out.print("Enter the number of Dice: ");
        Dice = sc.nextInt();

        if (Dice > 0) {
            int roll;
            for (int i = 1; i <= Dice; i++) {
                roll = ranNum.nextInt(1, 7);
                DicePrint(roll);
                System.out.println("You rolled "+roll);
                System.out.println();
                total += roll;
            }
        } else {
            System.out.print("Your number should greater than 0.");
        }

        System.out.println("Total: "+total);
        sc.close();
    }

    static void DicePrint(int roll) {
        String Dice1 = """
                 -------
                |       |
                |   ⸰   |
                |       |
                 -------
                 """;

        String Dice2 = """
                 -------
                |  ⸰    |
                |       |
                |     ⸰ |
                 -------
                 """;

        String Dice3 = """
                 -------
                | ⸰     |
                |   ⸰   |
                |     ⸰ |
                 -------
                 """;

        String Dice4 = """
                 -------
                | ⸰   ⸰ |
                |       |
                | ⸰   ⸰ |
                 -------
                 """;

        String Dice5 = """
                 -------
                | ⸰   ⸰ |
                |   ⸰   |
                | ⸰   ⸰ |
                 -------
                 """;

        String Dice6 = """
                 -------
                | ⸰   ⸰ |
                | ⸰   ⸰ |
                | ⸰   ⸰ |
                 -------
                 """;

        switch(roll){
            case 1 ->System.out.print(Dice1);
            case 2 ->System.out.print(Dice2);
            case 3 ->System.out.print(Dice3);
            case 4 ->System.out.print(Dice4);
            case 5 ->System.out.print(Dice5);
            case 6 ->System.out.print(Dice6);
        }
    }
}