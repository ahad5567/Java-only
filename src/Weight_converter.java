import java. util. Scanner;
public class Weight_converter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight, convertTo; int Option;
        System.out.print("For KG to LBS press = 1\nFor LBS to KG press = 2\nEnter: ");
        Option = sc.nextInt();
        if(Option == 1){
            System.out.print("Enter the KG: ");
            weight = sc.nextDouble();
            convertTo = weight * 2.20;
            System.out.printf("%.2f KG is %.2f LBS", weight, convertTo);
        }else if(Option == 2){
            System.out.print("Enter the LBS: ");
            weight = sc.nextDouble();
            convertTo = weight * 0.45;
            System.out.printf("%.2f LBS is %.2f KG", weight, convertTo);
        }else{
            System.out.print("Press 1 or 2 only.");
        }
        sc.close();
    }
}
