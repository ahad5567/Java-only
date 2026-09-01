public class consturctorClass {

    int roll;
    double gpa;
    String name;
    boolean isEnrolled=true;

    consturctorClass(String name, int roll, double gpa){
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;
    }

    void black(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.gpa);
        System.out.println(isEnrolled);
    }
}
