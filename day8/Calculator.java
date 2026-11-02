public class Calculator {
    int add(int a, int b) {
        int result = a + b;
        System.out.println("Int Sum: " + result);
        return result;
    }
    //method2
    double add(double a, double b) {
        double result = a + b;
        System.out.println("Double Sum: " + result);
        return result;
    }
    //method3
    int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Three-Int Sum: " + result);
        return result;
    }
    //method4
    String add(String a, String b) {
        String result = a + b;
        System.out.println("String Join: " + result);
        return result;
    }
}
