package com.practice.pubsimulator;

public class Innkeeper extends Human {
    static int dirtyGlasses = 0;

    Innkeeper(String name, int age, boolean male, int money) {
        super(name, age, male, money);
        inPub = true;
    }

    // no need to define separate getters and setters, because the child class uses the parent classes getters and setters

    public void washingGlasses(int numberGlasses) {
        if (dirtyGlasses > 0 && (dirtyGlasses - numberGlasses) >=0) {
            dirtyGlasses -= numberGlasses;
            System.out.println(name + " washed " + numberGlasses + " dirty glass(es). " + dirtyGlasses + " dirty glass(es) left.");
        } else if (dirtyGlasses == 0) {
            System.out.println("There are no dirty glasses. No need to wash anything.");
        } else {
            System.out.println("There is/are only " + dirtyGlasses + " dirty glass(es). " + name + " washes all dirty glasses left.");
            dirtyGlasses = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurrent number of dirty glasses: " + dirtyGlasses;
    }
}
