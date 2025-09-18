package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket;
    private int count;

    public ProductBasket(){
        this.basket = new Product[5];
        this.count = 0;
    }
    public void addInBasket(Product newProduct){
        if(count < basket.length){
            basket[count] = newProduct;
            count++;
        }else{
            System.out.println("Невозможно добавить продукт");
        }
    }
    public void getBasketPrice(){
        int priceCount = 0;
        if(basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                priceCount += basket[i].getPrice();
            }
        }
        System.out.println("Итого: " + priceCount);
    }
    public void printBasket(){
        if(basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                System.out.println(basket[i].getName() + ": " + basket[i].getPrice());
            }
        }else{
            System.out.println("в корзине пусто");
        }
    }
    public boolean coin(String name){
        int count = 0;
        boolean c = false;
        if(basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                if (name == basket[i].getName()) {
                    count++;
                }
            }
            if (count > 0) {
                c = true;
            }
        }
        System.out.println(c);
        return c;
    }
    public void clearBasket(){
        for (int i = 0; i < basket.length; i++) {
            basket[i]=null;
        }
    }
}
