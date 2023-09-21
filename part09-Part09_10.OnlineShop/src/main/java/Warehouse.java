/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> productsPrices;
    private Map<String, Integer> productsStocks;

    public Warehouse() {
        this.productsPrices = new HashMap<>();
        this.productsStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {

        productsPrices.put(product, price);
        productsStocks.put(product, stock);
    }

    public int price(String product) {
        if (productsPrices.get(product) == null) {
            return -99;
        } else {
            return productsPrices.get(product);

        }
    }

    public int stock(String product) {
        if (productsStocks.get(product) == null) {
            return 0;
        } else {
            return productsStocks.get(product);

        }
    }

    public boolean take(String product) {
        int currentStock = 0;
        if (!productsStocks.containsKey(product)) {
            return false;
        } else {
            currentStock = productsStocks.get(product);
        }

        if (currentStock == 0) {
            return false;
        } else {
            currentStock--;
            productsStocks.put(product, currentStock);
            return true;
        }

    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String product : this.productsPrices.keySet()) {
            products.add(product);
        }
        return products;
    }
}
