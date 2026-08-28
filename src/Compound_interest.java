import java. util. Scanner;
public class Compound_interest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int principal, rate, time;
        System.out.print("Enter your principal amount: ");
        principal = sc.nextInt();
        System.out.print("Enter the annual rate: ");
        rate = sc.nextInt();
        System.out.print("Enter the total year: ");
        time = sc.nextInt();
        sc.close();
        double Compound_int;
        Compound_int = principal * (Math.pow((1 + (rate/100.0)), time));

        System.out.printf("You compound interest after %d years with %d%% interest is %.2f",time, rate, Compound_int);

    }
}