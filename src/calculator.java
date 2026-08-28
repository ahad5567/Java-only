import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num_1, num_2, result = 0;
        boolean Valid = true;
        char operator;
        System.out.println("Enter two numbers: ");
        num_1 = sc.nextDouble();
        num_2 = sc.nextDouble();
        System.out.print("Enter a operator(+,-,*,/,%): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            default -> {
                System.out.println("Only choose these operator: +,-,*,/,%");
                Valid = false;
            }
            case '+' ->
                result = num_1 + num_2;

            case '-' ->
                result = num_1 - num_2;

            case '*' ->
                result = num_1 * num_2;

            case '/' ->
                result = num_1 / num_2;

            case '%' ->
                result = num_1 % num_2;

        }
        if (Valid) {
            System.out.printf("%.2f %c %.2f = %.2f", num_1, operator, num_2, result);

        }

        sc.close();

    }
}
