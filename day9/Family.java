public class Family {
    public static void main(String[]args){
        Child1 c1 = new Child1();
        c1.car = "BMW";
        c1.laptop = "Dell";
        c1.code();

        System.out.println("***********");

        Child2 c2 = new Child2();
        c2.car = "Audi";
        c2.laptop = "HP";
        c2.code();
    }
}
