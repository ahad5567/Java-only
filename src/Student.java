public class Student {
    String name;
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void student(){
        System.out.println("Student name: "+name);
        System.out.println("Student roll: "+roll);
    }
}
