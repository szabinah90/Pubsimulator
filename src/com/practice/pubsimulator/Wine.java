package com.practice.pubsimulator;

public class Wine extends Drinks {
    private int vintage;

    public Wine(String name, int price, int alcoholCont, int vintage) {
        super(name, price, alcoholCont);
        this.vintage = vintage;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    @Override
    public String toString() {
        return super.toString() + "Vintage: " + vintage;
    }
}
