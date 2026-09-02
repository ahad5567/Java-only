import java. util . Scanner;
import java. util. ArrayList;
import java. util. Collections;

public class ARRAYLIST {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size;
        String foods;
        System.out.print("Enter how many food you want: ");
        size = sc.nextInt();
        sc.nextLine();

        for(int i =1; i<=size; i++){
            System.out.print("Enter # "+i+" food: ");
            foods = sc.nextLine();
            food.add(foods);
        }

        Collections.sort(food);  // -> sorted arraylist
        System.out.println(food);

        sc.close();
    }
}
