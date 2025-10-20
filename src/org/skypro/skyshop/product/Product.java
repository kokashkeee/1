package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    protected String name;
    protected String message = "неверно указано имя товара";

    public Product(String name){
        this.name = name;
        if(name == null||name.isBlank()){
            throw new IllegalArgumentException("неверно указано имя товара");
        }
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

    public String getSearchTerm(){
        return name;
    }

    public String getSearchType(){
        return "PRODUCT";
    }
}
