public class Person {
    String first, last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void display(){
        System.out.println("full name: "+first+" "+last);
    }
}
