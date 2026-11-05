abstract public class Dog extends Animal {
    
    String breed;
    
    @Override
    public void makeSound(){
        System.out.println(name + " is barking...");
    }
    @Override
    public void move(){
        System.out.println("Dog moves by: Running");
    }
}
