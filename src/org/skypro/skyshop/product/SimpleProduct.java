package org.skypro.skyshop.product;

import org.w3c.dom.ls.LSOutput;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name + ": " + price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
