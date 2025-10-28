package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{

    private int price;
    private int sale;

    public DiscountedProduct(String name, int price, int sale){
        super(name);
        this.price = price - (price * sale) / 100;
        this.sale = sale;
        if (price<=0){
            throw new IllegalArgumentException("неверно указана цена товара");
        }
        if (sale<0||sale>100){
            throw new IllegalArgumentException("неверно указана скидка на товар");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return name + ": " + price + " (скидка " + sale + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
