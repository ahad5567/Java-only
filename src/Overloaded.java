public class Overloaded {
    String username;
    String email;
    int age;


    Overloaded(String name){
        this.username = name;
        this.email = "Not provided";
        this.age = 0;
    }

    Overloaded(String name, String mail, int age){
        this.username = name;
        this.email = mail;
        this.age = age;
    }

    Overloaded(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    void use(){
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
    }
}
