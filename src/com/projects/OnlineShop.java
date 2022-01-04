package com.projects;

public class OnlineShop {
    // we use the classes warehouse2,Item2

    public static void main(String[] args) {
        Warehouse2 warehouse = new Warehouse2();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));


        System.out.println("===================================");

        Warehouse2 warehous = new Warehouse2();
        warehouse.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("=========================");

        Warehouse2 warehouse2 = new Warehouse2();
        warehouse2.addProduct("milk", 3, 10);
        warehouse2.addProduct("coffee", 5, 6);
        warehouse2.addProduct("buttermilk", 2, 20);
        warehouse2.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse2.products()) {
            System.out.println(product);
        }

        System.out.println("=========================");
        Item2 item = new Item2("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

        System.out.println("=========================");
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());

        System.out.println("=========================");
        ShoppingCart carte = new ShoppingCart();
        carte.add("milk", 3);
        cart.print();
        System.out.println("carte price: " + carte.price() + "\n");

        carte.add("buttermilk", 2);
        carte.print();
        System.out.println("carte price: " + carte.price() + "\n");

        carte.add("milk", 3);
        carte.print();
        System.out.println("cart price: " + carte.price() + "\n");

        carte.add("milk", 3);
        carte.print();
        System.out.println("carte price: " + carte.price() + "\n");

    }
}
