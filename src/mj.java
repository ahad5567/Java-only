public class mj{
    String make = "BMW";
    String model = "BMW x5";
    int year = 2026;
    double price = 650000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Car is running.");
    }

    void stop(){
        isRunning = false;
        System.out.println("Car is not running.");
    }

    void drive(){
        System.out.println("You drive "+model);
    }

    void Break(){
        System.out.println("You break "+model);
    }

}