package com.practice.pubsimulator;

public class Mixed extends Drinks {

    /*
    public Mixed(String name, int price, int alcoholCont) {
        super(name, price, alcoholCont);
    }
     */

    public Mixed(String name, Drinks drink1, Drinks drink2) {
        this.name = name;
        setPrice((drink1.getPrice() + drink2.getPrice()) / 2);
        setAlcoholCont((drink1.getAlcoholCont() + drink2.getAlcoholCont()) / 2);
    }

    public Mixed(String name, Drinks drink1, Drinks drink2, Drinks drink3) {
        this.name = name;
        setPrice((drink1.getPrice() + drink2.getPrice() + drink3.getPrice()) / 3);
        setAlcoholCont((drink1.getAlcoholCont() + drink2.getAlcoholCont() + drink3.getAlcoholCont()) / 3);
    }

    public Mixed(String name, Drinks drink1, Drinks drink2, Drinks drink3, Drinks drink4) {
        this.name = name;
        setPrice((drink1.getPrice() + drink2.getPrice() + drink3.getPrice() + drink4.getPrice()) / 4);
        setAlcoholCont((drink1.getAlcoholCont() + drink2.getAlcoholCont() + drink3.getAlcoholCont() + drink4.getAlcoholCont()) / 4);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
