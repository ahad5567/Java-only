import java.util.Scanner;

public class square_root {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter 2 numbers: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        c  = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The square root of "+a+", "+b+" is "+c);

        scanner.close();
    }
}