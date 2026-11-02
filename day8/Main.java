public class Main {
    public static void main(String[] args) {
        //Part2
        Dog dog = new Dog();
        dog.name = "Leo";
        dog.makeSound();

        Cat cat = new Cat();
        cat.name = "Poos";
        cat.makeSound();

        Bird bird = new Bird();
        bird.name = "Mani";
        bird.makeSound();

        //Part3
        Animal animal1 = new Dog();
        animal1.name = "Bruno";
        animal1.makeSound();

        Animal animal2 = new Cat();
        animal2.name = "Kitty";
        animal2.makeSound();
        
        Animal animal3 = new Bird();
        animal3.name = "Sky";
        animal3.makeSound();
    }
}

