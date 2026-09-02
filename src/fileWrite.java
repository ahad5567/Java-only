import java.io.FileWriter;
import java.io.Writer;


public class fileWrite {
    public static void main(String[] args) {

        // you can make a String and put the path of the file instead of writing in parameter of FileWriter
        // Also u can make a String for what u want to write instead of writing it on write-> parameter

        try (FileWriter write = new FileWriter("//home//ahad-hossain-khan//Desktop//JAVA//src//test.txt")) {
            write.write("Hello what'up");
            System.out.println("Successfully written to the file!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");

        }
    }
}

