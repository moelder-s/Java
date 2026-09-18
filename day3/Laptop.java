class Laptop {
    //variables
    String brand;
    String model;
    double price;

    public static void main(String[] args){
        //create two laptop objects
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        //assign values
        laptop1.brand = "Asus";
        laptop1.model = "Tuff A15";
        laptop1.price = 350000;

        laptop2.brand = "lenovo";
        laptop2.model = "LOQ";
        laptop2.price = 380000;

        //display details
        System.out.println("Laptop 1:");
        System.out.println("Brand: " + laptop1.brand);
        System.out.println("Model: " + laptop1.model); 
        System.out.println("Price: " + laptop1.price);

        System.out.println("\nLaptop 2:");
        System.out.println("Brand: " + laptop2.brand);
        System.out.println("Model: " + laptop2.model);
        System.out.println("Price: " + laptop2.price);

    }

}
    

