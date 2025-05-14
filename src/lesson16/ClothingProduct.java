package lesson16;

public class ClothingProduct extends Product{
    String size;

    ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.75;
    }
}
