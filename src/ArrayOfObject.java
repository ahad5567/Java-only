import java. util. Scanner;
public class ArrayOfObject {
    public static void main(String[] args) {
        ArrayObjClass[] car = {new ArrayObjClass("BMW", "Black"),
                new ArrayObjClass("Ferrari", "Red"),
                new ArrayObjClass("Lamborghini", "Yellow")};

        for (ArrayObjClass cars : car) {
            cars.drive();
        }

    }
}
