import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, area, vol, cir;
        System.out.print("Enter the radius of a circle: ");
        radius = scanner.nextDouble();
        scanner.close();

        area = Math.PI * Math.pow(radius, 2);
        vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        cir = 2 * Math.PI * radius;


        System.out.print("The area, volumn and cir are below:\n");
        System.out.println(area+"\n"+vol+"\n"+cir);
    }
}
