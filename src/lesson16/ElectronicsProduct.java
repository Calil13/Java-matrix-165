package lesson16;

public class ElectronicsProduct extends Product{
    int warrantyInMonths;

    ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.9;
    }
}
