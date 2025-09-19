package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{

    private static final int price = 50;

    public FixPriceProduct(String name){
        super(name);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + ": Фиксированная цена " + price;
    }

    public boolean isSpecial() {
        return true;
    }
}
