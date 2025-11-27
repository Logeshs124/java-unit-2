class Calculator {
    void add(int a, int b) {
        int sum = a + b;
        displayResult(sum); // Nesting call
    }
    
    void displayResult(int result) {
        System.out.println("Result: " + result);
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 3); // Output: Result: 8
    }
}