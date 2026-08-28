import java. util . Scanner;
public class QuizGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char guss ;
        int totalCorrect = 0;
        char[] CorrectAns = {'B', 'D', 'A'};
        String[] qs = {"What is the capital city of France?", "2.Which of the following is the largest mammal on Earth?", "3.Which planet in our solar system is known as the Red Planet?"};
        String[][] choice = {{"A. London", "B. Paris", "C. Berlin", "D. Madrid"}, {"A. African Elephant", "B. Great White Shark", "C. Giraffe", "D. Blue Whale"}, {"A. Mars", "B. Venus", "C. Jupiter", "D. Saturn"}};

        System.out.println("**************************");
        System.out.println("Quiz started!");
        System.out.println("**************************");

        for(int i=0; i<3; i++){
            System.out.println(qs[i]);
            for(int j=0 ; j<4; j++){
                System.out.println(choice[i][j]+"\n");

            }

            System.out.print("Ans: ");
            guss = sc.next().charAt(0);
            if(guss == CorrectAns[i]){
                System.out.println("Correct");
                System.out.println();
                totalCorrect++;
            }else{
                System.out.println("Incorrect");
                System.out.println();
            }
        }

        System.out.println("*********************************************");
        System.out.printf("Thanks for participation you got %d out of 3\n", totalCorrect);
        System.out.println("*********************************************");
        sc.close();


    }
}