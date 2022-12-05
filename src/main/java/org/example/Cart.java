package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<Product>();

    public void add(Product product)
    {
        products.add(product);
    }

    public List<Product> getProducts()
    {
        return this.products;
    }
}
