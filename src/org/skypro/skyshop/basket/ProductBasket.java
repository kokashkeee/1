package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket;
    private int count;

    public ProductBasket(int size){
        this.basket = new Product[size];
        this.count = 0;
    }
    public void addInBasket(Product newProduct){
        if(count < 5){
            basket[count] = newProduct;
            count++;
        }else{
            System.out.println("Невозможно добавить продукт");
        }
    }

    public void printBasket(){
        int isSpecialCount = 0;
        int priceCount = 0;
        if(basket[0] != null) {
            for (int i = 0; i < basket.length; i++) {
                System.out.println(basket[i].toString());
                priceCount += basket[i].getPrice();
                if(basket[i].isSpecial()){
                    isSpecialCount++;
                }
            }
        }else{
            System.out.println("в корзине пусто");
        }
        System.out.println("Итого: " + priceCount);
        System.out.println("Специальных товаров: " + isSpecialCount);
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
