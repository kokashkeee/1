package org.skypro.skyshop.search;
import org.skypro.skyshop.exceptions.BestResultNotFound;

import org.skypro.skyshop.product.Product;

import java.util.LinkedList;
import java.util.List;

public class SearchEngine {

    private List<Searchable> searchable;
    private int count;

    public SearchEngine(){
        this.searchable = new LinkedList();
        this.count = 0;
    }

    public List search (String searchText){
        for (int i = 0; i < searchable.size(); i++) {
            if(!(searchable.get(i).getSearchTerm()).contains(searchText)){
                searchable.remove(i);
            }
        }
        System.out.println("Найдено " + searchable.size() + " совпадений по запросу '" + searchText + "':");
        for (int i = 0; i < searchable.size(); i++) {
            System.out.println(searchable);
        }
        return searchable;
    }


    public Searchable findBestMatch(String searchText) throws BestResultNotFound {
        if (searchText == null || searchText.trim().isEmpty() || count == 0) {
            throw new BestResultNotFound(searchText);
        }

        Searchable bestMatch = null;
        int maxCount = -1;

        for (int i = 0; i < searchable.size(); i++) {
            Searchable item = searchable.get(i);
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
        searchable.add(newSearch);
        count++;
    }

}
