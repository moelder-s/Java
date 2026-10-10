class Car{
    int year;
    String brand;
    double price;

    //constructor=a method like class name
    Car(){
        year = 2000;
        brand = "Unknown";
        price = 0.00;
    }

    //parameterized constructor
    Car(int year, String brand, double price){
        this.year = year;
        this.brand = brand;
        this.price = price;
    }

    //create object of car class
    void displayInfo(){
        System.out.println("Year: "+year);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}