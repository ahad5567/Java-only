import java. util. *;

public class rectrangle_calculate {

    public static void main(String[] args){
        double width, lenght;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width and lenght of a rectrangle:");
        width = sc.nextDouble();
        lenght = sc.nextDouble();

        double area = width * lenght;

        System.out.println("Area of the rectrangle is: "+area);

        sc.close();

    }
}