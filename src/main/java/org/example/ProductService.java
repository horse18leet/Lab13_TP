package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    static List<Product> products = new ArrayList<Product>();

    public void add(Product product)
    {
        products.add(product);
    }

    public void printAll()
    {
        //if (products != null)
        for (int i = 0; i<products.stream().count(); i++)
            System.out.println(products.get(i).title + ", " + products.get(i).coast);
    }

    public Product findByTitle(String title) {
        Product product = products.stream().filter(prod -> prod.getTitle().equals(title)).findFirst().get();
        return product;
    }
}
