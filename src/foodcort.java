import java.util.Scanner;
public class foodcort{
    public static void main(String[] args){
        String food;
        double price;
        int quantity;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the food you want to buy: ");
        food = sc.next();
        System.out.print("Enter the price of the food: ");
        price = sc.nextDouble();
        System.out.print("Enter the quantity of the food: ");
        quantity = sc.nextInt();
        sc.close();

        price *= quantity;

        System.out.println();
        System.out.println("Bill");
        System.out.println("-----------------------");
        System.out.println("Food is "+food);
        System.out.println("Total foods: "+quantity);
        System.out.println("Total price: "+price+" tk");
    }
}