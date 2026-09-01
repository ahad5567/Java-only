import java. util. Scanner;
public class Weeknd{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        int[] id = new int[3];
        double[] gpa = new double[3];

        System.out.println("Enter 3 students names: ");
        for(int i=0; i<3; i++){
            name[i] = sc.nextLine();
        }

        System.out.println("Enter their id numbers: ");
        for(int i=0; i<3; i++){
            id[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Enter their GPA: ");
        for(int i=0; i<3; i++){
            gpa[i] = sc.nextDouble();
            sc.nextLine();
        }

        for(int i=0; i<3; i++){
            Weeknded nice = new Weeknded(name[i], id[i], gpa[i]);
            nice.cool(name[i], id[i], gpa[i]);
        }
    }
}