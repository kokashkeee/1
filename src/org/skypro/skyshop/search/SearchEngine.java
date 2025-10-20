package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

public class SearchEngine {

    Searchable[] searchable;
    private int count;

    public SearchEngine(int size){
        this.searchable = new Searchable[size];
        this.count = 0;
    }

    public Searchable[] search (String searchText){
        int x = 0;
        Searchable[] searchable2 = new Searchable[searchable.length];
        for (int i = 0; i < searchable.length; i++) {
            if((searchable[i].getSearchTerm()).contains(searchText)){
                searchable2[x] = searchable[i];
                x++;
            }
        }
        System.out.println("Найдено " + x + " совпадений по запросу '" + searchText + "':");
        for (int i = 0; i < x; i++) {
            System.out.println(searchable2[i].toString());
        }
        return searchable2;
    }

    public void addInSearchList(Searchable newSearch){
        if(count < 5){
            searchable[count] = newSearch;
            count++;
        }else{
            System.out.println("Поисковый движок заполнен. Невозможно добавить новый элемент");
        }
    }
}
