package lesson16;

import lesson14.Figure;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public abstract double calculateDiscountedPrice();

    void printInfo() {
        System.out.println("Name of Product : " + name +
                "\nPrice of Product : " + price);
    }
}
