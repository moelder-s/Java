public class CalApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10.5, 20.5);
        calc.add(10, 20, 30);
        calc.add("Roy ", "Moelder");
    }
}
