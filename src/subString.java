import java.util.Scanner;

public class subString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email;
        System.out.println("Enter your email: ");
        email = scanner.nextLine();
        String username, lastpart;

        username = email.substring(0, email.indexOf("@"));
        lastpart = email.substring(email.indexOf("@") + 1);

        System.out.println("Username: "+username);
        System.out.println("Lastpart: "+lastpart);
        scanner.close();
    }
    
}
