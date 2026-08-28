import java. util. Scanner;

public class SearchArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  size;
        String target;
        String[] foods;
        boolean isFound;

        System.out.print("Enter number of foods: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for(int i = 0; i<size; i++ ){
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        System.out.print("Enter a targeted food: ");
        target = sc.nextLine();

        isFound = false;
        for(int i=0; i<size; i++){
            if(foods[i].equals(target)){
                isFound = true;
                System.out.println("Targeted food's index is "+i);
                break;
            }
        }

        if(isFound){
            System.out.println("Food is founded.");
        }else{
            System.out.println("Food is not founded.");
        }

        sc.close();

    }
}