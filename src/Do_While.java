import java. util . Scanner;
public class Do_While {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;


        do{
            System.out.println("You can not enter negative number.");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }while(age<0);

        System.out.println("You are "+age+" years old.");
        sc.close();

    }
}
