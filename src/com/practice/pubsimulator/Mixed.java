package com.practice.pubsimulator;

public class Mixed extends Drinks {

    public Mixed(String name, Drinks[] drink) {
        this.name = name;
        int price = 0;
        int alcohol = 0;

        for (int i = 0; i < drink.length; i++) {
            price += drink[i].getPrice();
        }

        for (int j = 0; j < drink.length; j++) {
            alcohol += drink[j].getAlcoholCont();
        }

        setPrice(price/drink.length);
        setAlcoholCont(alcohol/drink.length);

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
