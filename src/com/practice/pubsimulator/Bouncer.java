package com.practice.pubsimulator;

public class Bouncer extends Human {
    private boolean working;
    static int workingBouncers = 0;

    Bouncer(String name, int age, boolean male, int money, boolean working) {
    super(name, age, male, money);
    this.working = working;
    if (this.working) {
        workingBouncers += 1;
        inPub = true;
    }
    }

    public void startsWorking() {
            if (inPub && working) {
                System.out.println(name + " is already working.");
            } else if (inPub && !working) {
                working = true;
                workingBouncers += 1;
                System.out.println(name + " started working.");
            } else {
            System.out.println(name + " have to go to the Pub first to start working.");
        }

    }

    public void stopsWorking() {
        if (working) {
            working = false;
            workingBouncers -= 1;
            System.out.println(name + " stopped working.");
        } else {
            System.out.println(name + " already stopped working.");
        }
    }

    public boolean isWorking() {
        return working;
    }

    @Override
    public void drinking(Innkeeper innkeeper, Drinks drink) {
        if (working && drink.getAlcoholCont() != 0) {
            System.out.println(name + " can only consume non-alcoholic beverages as he is working!");
        } else {
            super.drinking(innkeeper, drink);
        }
    }

    @Override
    public void drinking(Innkeeper innkeeper) {
        if (working) {
            System.out.println(name + " cannot drink while working!");
        } else {
            super.drinking(innkeeper);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nWorking?: " + working + "\nWorking bouncers currently: " + workingBouncers;
    }
}
