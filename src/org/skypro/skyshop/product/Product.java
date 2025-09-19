package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
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

    public String getSearchTerm(){
        return name;
    }

    public String getSearchType(){
        return "PRODUCT";
    }
}
