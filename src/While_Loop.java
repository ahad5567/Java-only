import java. util. Scanner;
public class While_Loop{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello "+name+"!");
        sc.close();
    }
}
