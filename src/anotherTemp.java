import java.util.Scanner;

public class anotherTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type;
        double temp, oldtemp, hello;
        System.out.println("Enter temp: ");
        temp = sc.nextDouble();
        oldtemp = temp;
        System.out.println("Enter C/F");
        type = sc.next();
        type = type.toUpperCase();
        hello = (type.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 1.8) + 32;
        if (type.equals("C")) {
            System.out.printf("%.2f fahenhite = %.2f degree cel", oldtemp, hello);
        } else if (type.equals("F")) {
            System.out.printf("%.2f degree cel = %.2f fahenhite ", oldtemp, hello);
        } else {
            System.out.println("Press only C/f");
        }
        sc.close();

    }
}
