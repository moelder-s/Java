class CarApp{
    //keep main method 
    public static void main(String[] args){
        //create object 
        Car obj1 = new Car();
        obj1.displayInfo();

        Car obj2 = new Car(2024,"BMW", 24000000.0);
        obj2.displayInfo();
    }
}