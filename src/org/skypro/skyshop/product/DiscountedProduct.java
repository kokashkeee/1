package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{

    private int price;
    private static int sale = 50;

    public DiscountedProduct(String name, int price){
        super(name);
        this.price = price - (price * sale) / 100;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return name + ": " + price + " (" + sale + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
