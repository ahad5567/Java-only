public class Varargs {
    public static void main(String[] args){
        /*
        method use kora hoi main method ke clean rakhar jonno. same name er method er parameter change kore onk gula
        create kora jai like  int hello(int x, int y) and also int hello(int x, int y, int z ,...etc.) but ei duitar
        same work.
        So ei overloaded ba same thing ke merge korar jonno varargs use kora hoi.
        like,
            int hello(int...number)  -> ei khane "number" holo Array jate parameter e send kora value gula store take.
         */


        System.out.println(sum(1,2,3,4,5,6,7,8));

        System.out.println(avg(1,2,3,4,5,6,7));
    }

    static int sum(int...number){
        int sum = 0;

        for(int hello : number){
            sum += hello;
        }

        return sum;
    }

    static double avg(double...number){
        double sum =0;

        for(double hello : number){
            sum += hello;
        }

        return sum / number.length;
    }
}
