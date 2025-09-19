package org.skypro.skyshop.product;

public abstract class Product {
    protected String name;

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    public abstract boolean isSpecial();

    public abstract int getPrice();
}
