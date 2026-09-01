import java.util.Scanner;

public class Super {
    public static void main(String[] args){
        Person person;
        StudenT student;
        Employee employee;
        Scanner sc = new Scanner(System.in);
        String first , last;
        int number;
        double gp;

        System.out.println("Enter first name: ");
        first = sc.nextLine();

        System.out.println("Enter last name: ");
        last = sc.nextLine();

        person = new Person(first, last);

        System.out.println("Enter first name of student: ");
        first = sc.nextLine();

        System.out.println("Enter last name of student: ");
        last = sc.nextLine();

        System.out.println("Enter GPA: ");
        gp = sc.nextDouble();
        sc.nextLine();

        student = new StudenT(first, last, gp);

        System.out.println("Enter first name of employee: ");
        first = sc.nextLine();

        System.out.println("Enter last name of employee: ");
        last = sc.nextLine();

        System.out.println("Enter salary: ");
        number = sc.nextInt();

        employee = new Employee(first, last , number);


        person.display();
        student.display();
        employee.display();



        sc.close();






    }
}
