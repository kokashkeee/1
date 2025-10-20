package org.skypro.skyshop.search;
import org.skypro.skyshop.exceptions.BestResultNotFound;

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


    public Searchable findBestMatch(String searchText) throws BestResultNotFound {
        if (searchText == null || searchText.trim().isEmpty() || count == 0) {
            throw new BestResultNotFound(searchText);
        }

        Searchable bestMatch = null;
        int maxCount = -1;

        for (int i = 0; i < count; i++) {
            Searchable item = searchable[i];
            if (item != null) {
                String searchTerm = item.getSearchTerm();
                int occurrences = countOccurrences(searchTerm, searchText);

                if (occurrences > maxCount) {
                    maxCount = occurrences;
                    bestMatch = item;
                }
            }
        }
        if (maxCount > 0) {
            return bestMatch;
        } else {
            throw new BestResultNotFound(searchText);
        }
    }

    public int countOccurrences(String text, String substring) {
        if (text.isEmpty() || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;
        int substringIndex = text.indexOf(substring, index);

        while (substringIndex != -1) {
            count++;
            index = substringIndex + substring.length();
            substringIndex = text.indexOf(substring, index);
        }

        return count;
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
