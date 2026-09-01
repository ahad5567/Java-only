public class inheritance {   // ek class er method r attribute onno class use korte pare
                                //child <- parent <- grandparent

    public static void main(String[] args){
        Animal animal = new Animal();
        Plant plant = new Plant();
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.cats();
        dog.dogs();
        plant.plants();
    }
}
