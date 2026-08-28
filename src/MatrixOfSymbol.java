import java. util. Scanner;
public class MatrixOfSymbol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row, column;
        char symbol;
        System.out.print("Enter row and column number: ");
        row = sc.nextInt();
        column = sc.nextInt();

        System.out.println("Enter a symbol: ");
        symbol = sc.next().charAt(0);

        System.out.printf("The %c symbol matrix is below: \n",symbol);
        System.out.println("---------------------------------");
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                System.out.print(" "+symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}
