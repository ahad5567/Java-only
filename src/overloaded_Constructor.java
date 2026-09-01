public class overloaded_Constructor {
    public static void main(String[] args){
        Overloaded over1 = new Overloaded("Leon", "leon25@gmail.com", 25);
        Overloaded over2 = new Overloaded("Bob");
        Overloaded over3 = new Overloaded();

        over1.use();
        over2.use();
        over3.use();

    }
}
