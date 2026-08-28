import java. util . Scanner;

public class intput {

     public static void main(String[] args){
        String name;
        int age;
        boolean isStudent;
        double gpa;

        Scanner hello = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = hello.nextLine();
        System.out.println("Enter your age;");
        age = hello.nextInt();
        System.out.println("Enter your GPA");
        gpa = hello.nextDouble();
        System.out.println("Are you a student (true/false):");
        isStudent = hello.nextBoolean();
        hello.close();
        System.out.println("Hi "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your gpa is "+gpa);
         if(isStudent){
            System.out.println("Your are enrolled as a student.");
         }else{
            System.out.println("You are not enrolled as a student.");
         }
     }
}