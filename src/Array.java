import java. util. Arrays;

public class Array {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Banana", "Orange" , "Coconut"};

       /* for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }*/


        //Arrays.sort(fruits); -> used to sort an array

        //Arrays.fill(fruits, "Ahad");  -> used to fill an array with Ahad

        int numOfFruits = fruits.length; // used to determine Array's total elements.


        for(String Hello: fruits){ //Enhanced for-loop, 1st DataType then a normal name then colon then name of Array.
            System.out.println(Hello);
        }
    }
}





