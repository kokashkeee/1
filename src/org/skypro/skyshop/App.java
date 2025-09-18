package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Сыр", 150);
        Product product2 = new Product("Хлеб", 30);
        Product product3 = new Product("Молоко", 90);
        Product product4 = new Product("Яйца", 80);
        Product product5 = new Product("Пиво", 110);
        Product product6 = new Product("Сахар", 70);

        ProductBasket basket = new ProductBasket();

        basket.addInBasket(product1);
        basket.addInBasket(product2);
        basket.addInBasket(product3);
        basket.addInBasket(product4);
        basket.addInBasket(product5);
        basket.addInBasket(product6);

        basket.printBasket();

        basket.getBasketPrice();

        basket.coin("Хлеб");

        basket.coin("Яблоки");

        basket.clearBasket();

        basket.printBasket();

        basket.getBasketPrice();

        basket.coin("Хлеб");
    }
}