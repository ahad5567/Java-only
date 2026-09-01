import java. util. Scanner;
public class StudentList {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        String name;
        int id;
        System.out.print("Enter total students: ");
        size = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter name of the student: ");
            name = sc.nextLine();

            System.out.print("Enter id of the student: ");
            id = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, id);
        }
        System.out.println();
        System.out.println("Student list");
        System.out.println("_____________");
        for(Student hi: students){
            hi.student();
        }

        sc.close();
    }
}
