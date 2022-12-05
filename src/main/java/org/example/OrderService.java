package org.example;

import java.util.List;

public class OrderService {
    public List<Product> products;

    public OrderService(List<Product> products)
    {
        this.products = products;
    }

    public void printAll()
    {
        double allcoast = 0;
        for (Product pd : products) {
            System.out.println(pd.title + ", " + pd.coast);
            allcoast += pd.coast;
        }
        System.out.println("Общая сумма " + allcoast);
    }
}
