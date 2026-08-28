    import java. util . Scanner;
    public class Methode{
        public static void main(String[] args){
            String name1, name2;
            int age;
            double num, result;
            Scanner sc = new Scanner(System.in);
                    System.out.print("Enter your first name and last name: ");
                    name1 = sc.nextLine();
                    name2 = sc.next();
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
            HuggingFace(FullName(name1, name2), age);
            result = cube(num);
            System.out.println("Cube of "+num+" is "+ result);
            sc.close();

        }

        static void HuggingFace(String name, int age){
            System.out.println("Happy birthday to "+name);
            System.out.println("You are "+age+" years old.");
        }

        static double cube(double num){
            return num * num * num ;
        }

        static String FullName(String name1, String name2){
            return name1+ name2;
        }

    }