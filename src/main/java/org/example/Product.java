package org.example;

public class Product {
    public Product(String title, double coast)
    {
        this.title = title;
        this.coast = coast;
    }

    int id;

    String title;

    double coast;

    public String getTitle()
    {
        return title;
    }
}
