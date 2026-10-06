class Calculator {

    int num1 = 10;
    int num2 = 5;

    // Method 1
    // Non-parameterized | Non-return type
    void addNumbers() {
        int tot = num1 + num2;
        System.out.println("Add: " + tot);
    }

    // Method 2
    // Parameterized | Non-return type
    void subNumbers(int a, int b) {
        int sub = a - b;
        System.out.println("Sub: " + sub);
    }

    // Method 3
    // Non-parameterized | Return type
    int divNumbers() {
        int divd = num1 / num2;
        return divd;
    }

    // Method 4
    // Parameterized | Return type
    int mulNumbers(int a) {
        int mul = num1 * a;
        System.out.println("Mul: " + mul);
        return mul;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.addNumbers();

        obj.subNumbers(20, 5);

        int division = obj.divNumbers();
        System.out.println("Div: " + division);

        obj.mulNumbers(4);
    }
}