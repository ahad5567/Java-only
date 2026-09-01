public class sdafas {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    sdafas(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        isEnrolled = true;
    }

    void st(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("GPA: "+gpa);
        System.out.println(isEnrolled);
    }

}
