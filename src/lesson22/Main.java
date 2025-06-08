package lesson22;

public class Main {
    public static void main(String[] args) {

        double result = Currency.USD.convert(5, Currency.EURO);
        System.out.println(result);
    }
}
