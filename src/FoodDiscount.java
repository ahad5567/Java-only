import java.util.Scanner;
import java.time.*;

public class FoodDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String student, regular;
        int TypeOfFood, Quantity;
        double price = 0.0;
        LocalDateTime todayBill = LocalDateTime.now();
        System.out.println("Our food chart is below: ");
        System.out.print(
                "1. Biriany-half (200tk)\n2. Biriany-full (400tk)\n3. Mutton Kacchi 1:3 (320tk)\n4. Mutton Kacchi-full with Coke (700tk)\n5. Borhani per glass (70tk)\n6. Special Laccha per glass (65tk)\n");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Enter the number of the food to order: ");
        TypeOfFood = sc.nextInt();
        System.out.print("Enter the quantity of that food: ");
        Quantity = sc.nextInt();

        System.out.print("Are you a student?(Yes/No): ");
        student = sc.next();
        sc.nextLine();
        System.out.print("Are you regular customer? (Yes/No): ");
        regular = sc.next();

        if (TypeOfFood == 1) {
            price = 200 * Quantity;
        } else if (TypeOfFood == 2) {
            price = 400 * Quantity;
        } else if (TypeOfFood == 3) {
            price = 320 * Quantity;
        } else if (TypeOfFood == 4) {
            price = 700 * Quantity;
        } else if (TypeOfFood == 5) {
            price = 70 * Quantity;
        } else if (TypeOfFood == 6) {
            price = 65 * Quantity;
        } else {
            System.out.println("Enter number 1 to 6 only.");
        }

        if (TypeOfFood >= 1 && TypeOfFood <= 6) {
            if (student.equalsIgnoreCase("Yes")) {
                if (regular.equalsIgnoreCase("Yes")) {
                    price *= 0.9;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf(
                            "Your Total bill with student and regular customer discount: %.2ftk\nBill printed on %s%n",
                            price, todayBill);
                    System.out.println("-----------------------------------------------------------------------");
                } else {
                    price *= 0.93;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("Your Total bill with student discount: %.2ftk\nBill printed on %s%n", price,
                            todayBill);

                    System.out.println("-----------------------------------------------------------------------");
                }
            } else {

                if (regular.equalsIgnoreCase("Yes")) {
                    price *= 0.97;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("Your Total bill with regular customer discount: %.2ftk\nBill printed on %s%n",
                            price, todayBill);

                    System.out.println("-----------------------------------------------------------------------");
                } else {
                    price *= 1;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("Your Total bill: %.2ftk\nBill printed on %s%n", price, todayBill);

                    System.out.println("-----------------------------------------------------------------------");
                }
            }
        }

        sc.close();

    }
}
