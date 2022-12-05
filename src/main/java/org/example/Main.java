package org.example;

public class Main {
    public static void main(String[] args)
    {
        ProductService ps = new ProductService();

        for (int i = 1; i<=10; i++)
        {
            ps.add(new Product("Крутой продукт " + i, i+150.0D));
        }

        //ps.printAll();

        Cart cart = new Cart();
        cart.add(ps.findByTitle("Крутой продукт 6"));
        cart.add(ps.findByTitle("Крутой продукт 5"));

        OrderService os = new OrderService(cart.getProducts());
        os.printAll();
    }
}