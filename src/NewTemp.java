import java.util.Scanner;

public class NewTemp {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        double Temp, OldTemp;
        String unit;
        System.out.print("Enter the temperature: ");
        Temp = sc.nextDouble();
        OldTemp = Temp;
        System.out.print("Convert to Celsius or Farhenhite? (C/F):");
        unit = sc.next();
        if (unit.equalsIgnoreCase("C")) {
            Temp = (Temp - 32) * 5 / 9;
            System.out.printf("%.2f Farhenhite equals to %.2f degree Celsius", OldTemp, Temp);
        } else if (unit.equalsIgnoreCase("F")) {
            Temp = (Temp * 1.8) + 32;
            System.out.printf("%.2f Celsius equals to %.2f degree Farhenhite", OldTemp, Temp);
        } else {
            System.out.println("Press C or F only.");
        }
        sc.close();
    }

}
