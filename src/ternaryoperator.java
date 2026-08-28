import java.util.Scanner;

public class ternaryoperator {

    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = scanner.nextInt();
        String EvernOrOdd;
        EvernOrOdd = (a % 2 == 0) ? "Even" : "Odd"; 
        System.out.println(EvernOrOdd);
        scanner.close();

        /*varibal = (condition) ? ifTure : ifFalse */

    }
}