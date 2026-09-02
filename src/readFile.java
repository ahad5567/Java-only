import java.io.BufferedReader;
import java.io.FileReader;

public class readFile {
    public static void main(String[] args){

        String filePath = "/home/ahad-hossain-khan/Desktop/JAVA/src/test.txt", line;
                                                    // Must add new FileReader
        try(BufferedReader hi = new BufferedReader(new FileReader(filePath))){  // <- To read file you must do this.
            System.out.println("Read successfully.");

            while((line = hi.readLine()) != null){
                System.out.println(line);
            }
            /*
            line = hi.readLine() -> this thing points every line of the file
            and when there are no line it means null so that the while loop will stop

             */

        }
        catch(Exception e ){
            System.out.println("Something wrong!");
        }
    }
}
