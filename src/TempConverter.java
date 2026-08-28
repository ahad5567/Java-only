import java. util. Scanner;
public class TempConverter {
    public static void main(String[] args){
        double cel, far, type;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("To covert celcius to farhenhite press: 1\nTo convert farhenhite to celcius press: 2");
        type = scanner.nextDouble();
        if(type==1){
            System.out.print("Enter temperature in celcius: ");
            cel = scanner.nextDouble();
            far = (cel*1.8) +32;
            System.out.printf("%.2f degree celcius is %.2f farhenhite", cel,far);
        }
        else if(type==2){
            System.out.print("Enter temperature in farhenhite: ");
            far = scanner.nextDouble();
            cel = (far - 32) * 5/9;
            System.out.printf("%.2f degree farhenhite is %.2f celcius",far, cel);
        }else{
            System.out.println("Press 1 or 2 only.");
        }
        scanner.close();
    }
}
