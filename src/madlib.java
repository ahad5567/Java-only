import java. util. *;

public class madlib{
    public static void main(String[] args){
        String a,b,c,d,e;
        System.out.println("This is the passage:");
        System.out.println("Every morning, Rafi wakes up at (1) ______ and gets ready for school. He usually has (2) ______ for breakfast before leaving home. His school is about two kilometers (3) ______ his house. He goes there by (4) ______ with his best friend. Rafi enjoys studying (5) ______ because he wants to become an engineer.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Fill the words:");

        a = sc.next();
        sc.nextLine();
        b = sc.next();
        sc.nextLine();
        c = sc.next();
        sc.nextLine();
        d = sc.next();
        sc.nextLine();
        e = sc.next();
        
        System.out.println("The passage is now:");
        System.out.println("Every morning, Rafi wakes up at "+a+" and gets ready for school. He usually has "+b+" for breakfast before leaving home. His school is about two kilometers "+c+" his house. He goes there by "+d+" with his best friend. Rafi enjoys studying "+e+" because he wants to become an engineer.");

        sc.close();

    }
}