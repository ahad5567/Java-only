public class varibale{
    public static void main(String[] args){
        int age = 20;
        double price = 19.99;
        char grade = 'A';
        String car ="BMW";
        String symbol = "$";
        boolean isOnline = true;
        boolean isStudent = false;

        if(isOnline){
            System.out.println("you are online.");
        }else{
            System.out.println("You are offline");
        }

        if(isStudent){
            System.out.println("You are a student.");
        }else{
            System.out.println("You are not a student.");
        }
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite car brand is " +car+".");
        System.out.println("The price of a pizza is " +price+" "+ symbol);
        System.out.println("Your average grade is " +grade);
        System.out.println("Your choice are: "+symbol+car+age);
    }
}