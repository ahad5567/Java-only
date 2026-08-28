import java.util.Random;
public class random{
    public static void main(String[] args){
    Random ran_number = new Random();

    int num = ran_number.nextInt(1, 7);

    System.out.println(num);
    }
}

// it can be used in double, boolean
