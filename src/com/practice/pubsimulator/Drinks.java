package com.practice.pubsimulator;

public class Drinks {
    String name;
    private int price;
    private int alcoholCont;

    Drinks() {
    }

    Drinks(String name, int price, int alcoholCont) {
        this.name = name;
        this.price = price;
        this.alcoholCont = alcoholCont;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAlcoholCont() {
        return alcoholCont;
    }

    // Setters
    public void setPrice(int price) {
        this.price = price;
    }

    public void setAlcoholCont(int alcoholCont) {
        if (alcoholCont < 0) {
            System.out.println("The alcohol content cannot be a negative number.");
        } else {
            this.alcoholCont = alcoholCont;
        }
    }

    public String toString() {
        return name + "'s price: " + getPrice() + "\n" + name + "'s alcohol content: " + getAlcoholCont();
    }
}
