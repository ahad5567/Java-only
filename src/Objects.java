public class Objects{
    public static void main(String[] args){
        ObjectClass Hello = new ObjectClass();


        int hi = Hello.age;

        System.out.println("My age is "+Hello.age);
        System.out.println("My name is "+Hello.name);
        System.out.println(hi);


        Hello.hi();
        System.out.println(Hello.isWhat);
        Hello.fssf();
        System.out.println(Hello.isWhat);
    }
}