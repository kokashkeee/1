package org.skypro.skyshop.exceptions;

public class BestResultNotFound extends Exception {

    private final String searchQuery;

    public BestResultNotFound(String searchQuery) {
        super("Не найден подходящий объект для поискового запроса: '" + searchQuery + "'");
        this.searchQuery = searchQuery;
    }

    public BestResultNotFound(String searchQuery, String message) {
        super(message);
        this.searchQuery = searchQuery;
    }

    public String getSearchQuery() {
        return searchQuery;
    }
}
