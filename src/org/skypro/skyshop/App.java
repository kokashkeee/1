package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product product1 = new SimpleProduct("Сыр", 150);
        Product product2 = new FixPriceProduct("Хлеб");
        Product product3 = new DiscountedProduct("Молоко", 90);
        Product product4 = new SimpleProduct("Яйца", 80);
        Product product5 = new SimpleProduct("Пиво", 110);
        Product product6 = new SimpleProduct("Сахар", 70);

        ProductBasket basket = new ProductBasket();

        basket.addInBasket(product1);
        basket.addInBasket(product2);
        basket.addInBasket(product3);
        basket.addInBasket(product4);
        basket.addInBasket(product5);
        basket.addInBasket(product6);

        basket.printBasket();

        basket.coin("Хлеб");

        basket.coin("Яблоки");

        basket.clearBasket();

        basket.printBasket();

        basket.coin("Хлеб");
    }
}