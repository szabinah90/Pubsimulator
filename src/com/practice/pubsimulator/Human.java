package com.practice.pubsimulator;

public class Human {
    String name;
    int age;
    boolean male;
    // public static int numberOfCreations;
    private int money;
    int drunkenness = 0;
    boolean inPub;

    /*
    Default constructor. Exists by default with the default values of the data-types.
    Here, I added custom default values.

   Human() {
        name = "Gordon";
        age = 30;
        male = true;
        numberOfCreations += 1;
    }
    */

    Human(String name, int age, boolean male, int money) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.money = money;
        // numberOfCreations += 1;
    }

    // Getters
    public String getName() {
       return name;
    }

    public int getAge() {
       return age;
    }

    // for booleans, getter is named as "is" + "name of the variable"
    public boolean isMale() {
       return male;
    }

    public int getMoney() {
        return money;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       if (age < 0) {
           System.out.println("Age cannot be less than 0.");
       } else {
           this.age = age;
       }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void drinking(Innkeeper innkeeper) {
        if (inPub) {
            money -= 1;
            drunkenness += 1;
            Innkeeper.dirtyGlasses += 1;
            innkeeper.setMoney(innkeeper.getMoney() + 1);
            if (drunkenness < 40) {
                System.out.println(name + " is partying hard.");
            } else {
                System.out.println(name + "drank too much alcohol so he/she passed out.");
                sleeping();
            }
        } else {
            System.out.println(name + " is not in the pub.");
        }
    }

    public void drinking(Innkeeper innkeeper, Drinks drink) {
        if (inPub) {
            if (money >= drink.getPrice()) {
                money -= drink.getPrice();
                drunkenness += drink.getAlcoholCont();
                Innkeeper.dirtyGlasses += 1;
                innkeeper.setMoney(innkeeper.getMoney() + drink.getPrice());
                if (drunkenness < 40) {
                    System.out.println(name + " is partying hard. Drank a shot of " + drink.getName() + ".");
                } else {
                    System.out.println(name + " drank a shot of " + drink.getName() + ". It was too much. " + name + " passed out.");
                    sleeping();
                }
            } else {
                System.out.println(name + " has not enough money to drink " + drink.getName() + ".");
            }
        } else {
            System.out.println(name + " is not in the bar.");
        }
    }

    public void sleeping() {
        drunkenness = 0;
        System.out.println(this.name + " is asleep.");
    }

    public void goingHome() {
        if (inPub) {
            inPub = false;
            System.out.println(this.name + " went home.");
        } else {
            System.out.println(name + " is already home.");
        }
    }

    public void goingPub() {
        if (inPub) {
            System.out.println(name + " is already in the pub.");
        } else {
            inPub = true;
            System.out.println(this.name + " arrived at the pub.");
        }
    }

    // Greeting "behaviour" (method)
    public void greetings() {
        if (male) {
            System.out.println("Hi! My name is " + name + ", I am " + age + " years old, and I am a male.");

        } else {
            System.out.println("Hi! My name is " + name + ", I am " + age + " years old, and I am a female.");
        }
    }

    public void fuckingWith(Human otherHuman) {
        if (Bouncer.workingBouncers != 0) {
            System.out.println("One of the working bouncers kicked " +
                    name + "'s sorry ass out for fucking with " + otherHuman.name + ". This behaviour is not allowed.");
            goingHome();
        } else {
            System.out.println(name + " to " + otherHuman.name + ": What are you lookin' at? Come here bitch, and I beat the shit out of you!");
        }
    }

    // "Overwriting" the default toString (from the ancestor class, Object)
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nMale?: " + this.male + "\nCurrent money: " + this.money +
                "\nIn the pub?: " + this.inPub + "\nDrunkenness: " + this.drunkenness;
    }
}
