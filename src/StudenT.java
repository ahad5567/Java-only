public class StudenT extends Person{

    double gpa;

    StudenT(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void display(){
        System.out.println(first+"'s gpa is: "+gpa);
    }
}
