import java. util. Scanner;
public class AnotherWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter you age: ");
        age = sc.nextInt();

        while(age<0){
            System.out.println("Your age can not be negative.");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }

        System.out.println("Your age is "+age);
        sc.close();

    }
}
