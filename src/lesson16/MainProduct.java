package lesson16;

public class MainProduct {
    public static void main(String[] args) {
        Product[] products = new Product[100];

        ElectronicsProduct electronicsProduct = new ElectronicsProduct("X",1000);
        ClothingProduct clothingProduct = new ClothingProduct("Y",2000);

        electronicsProduct.printInfo();
        clothingProduct.printInfo();

        System.out.println("Electronics Discounted : " + electronicsProduct.calculateDiscountedPrice());
        System.out.println("Clothing Discounted : " + clothingProduct.calculateDiscountedPrice());
    }
}
