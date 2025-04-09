package lesson8;

public class CalculatorCall {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.sum(12,5);
        System.out.println("Sum with 2 ints : " + result1);

        int result2 = calculator.sum(5,2,3);
        System.out.println("Sum with 3 ints : " + result2);

        double result3 = calculator.sum(4.2,1.8);
        System.out.println("Sum with 2 doubles : " + result3);
    }
}
