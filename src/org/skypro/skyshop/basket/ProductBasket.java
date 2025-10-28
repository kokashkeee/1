package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private List<Product> basket;
    private int priceCount;
    private List<String> deletedProducts = new LinkedList<>();

    public ProductBasket(){
        this.basket = new LinkedList<>();
    }

    public void addInBasket(Product newProduct){
        priceCount += newProduct.getPrice();
        basket.add(newProduct);
    }

    public void printBasket(){
        int isSpecialCount = 0;
        if(basket.get(0) != null) {
            System.out.println(basket);
        }else{
            System.out.println("в корзине пусто");
        }
//        System.out.println("Итого: " + priceCount);
//        System.out.println("Специальных товаров: " + isSpecialCount);
    }
    public boolean coin(String name){
        int count = 0;
        boolean c = false;
        if(basket.get(0) != null) {
            for (int i = 0; i < basket.size(); i++) {
                if (name == basket.get(i).getName()) {
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
        for (int i = 0; i < basket.size(); i++) {
            basket.set(i, null);
        }
    }

    public LinkedList<String> deleteFromBasket(String name){
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i).getName()==name){
                deletedProducts.add(name);
                basket.remove(i);
            }
        }
        if(deletedProducts.size() == 0){
            deletedProducts.add("Список пуст");
        }
        return (LinkedList) deletedProducts;
    }
}
