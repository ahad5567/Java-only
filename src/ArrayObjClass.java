public class ArrayObjClass {
    String name;
    String color;


    ArrayObjClass(String name, String color){
        this.name = name;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive "+color+" colored "+name);
    }
}
