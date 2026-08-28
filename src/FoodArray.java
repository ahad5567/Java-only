import java.util.Scanner;

public class FoodArray{
    public static void main(String[] args){
        int FoodSize;
        String[] Foods;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of foods you want: ");
        FoodSize = sc.nextInt();
        sc.nextLine(); // After taking integer input always use sc.nextLine() to avoid buffer

        Foods = new String[FoodSize];

        for(int i=0; i<FoodSize; i++){
            System.out.print("Enter your food: ");
            Foods[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Your foods are: ");
        for(String Hi : Foods){
            System.out.println(Hi);
        }

        sc.close();
    }
}