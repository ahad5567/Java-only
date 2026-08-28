import java .util. Random;
import java. util. Scanner;
public class _2dArray {
    public static void main(String[] args){
        int[][] Matrix;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int row, column, sumOfMat=0 ;
        System.out.print("Enter the row and column number of a matrix: ");
        row = sc.nextInt();
        sc.nextLine();
        column = sc.nextInt();
        Matrix = new int[row][column];


        for(int i=0; i<row; i++){                // Initialize every thing of matrix with random value.
            for(int j=0; j<column; j++){
                Matrix[i][j] = ran.nextInt(1,1000);
            }
        }

        for(int[] ArrayElement : Matrix){       /* Counts every values of Matrix.  ArrayElement hoise
                                                   2D Matrix er element and Element hoise 1D ArrayElement er elemnt*/
            for(int Element : ArrayElement){
                sumOfMat += Element;
            }
        }

        System.out.println("Sum of "+row+" * "+column+" matrix is: "+sumOfMat);
        sc.close();

    }
}
