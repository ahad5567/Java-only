public class Weeknded{
    int id;
    double gpa;
    String name;
    boolean bad = true;


    Weeknded(String name, int id, double gpa){
            this.name = name;
            this.id = id;
            this.gpa = gpa;
    }


    void cool(String name, int id, double gpa){

        System.out.println("Student's name "+name);
        System.out.println("Id: "+id);
        System.out.println("GPA: "+gpa);
        System.out.println("Enrolled: "+bad);
    }

}