import java.util.Scanner;

public class exception {
    public static void main(String[] args){
        /*
        In exception there are three things: try{}, catch{}, final{}
        -> a block of code that might be dangerous or have chances to show
            exceptions is written in try{}
        -> and catch(here is written the exception){ message of what is the exception }
        -> final{} is often used but not used mostly. The codes inside final{} are always
            execute.
         */
        Scanner sc = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Enter two numbers for division:");
            a = sc.nextInt();
            sc.nextLine();
            b = sc.nextInt();
            System.out.println(a/ b);  // you can not divide anything with 0. So it's an exception
        }

        catch(Exception e){
            System.out.println("You can not divide with ZERO idiot!");
        }

        finally{
            System.out.println("This thing is executed.");
        }
    }
}
