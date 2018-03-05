package com.practice.pubsimulator;

public class Main {
    public static void main(String[] args) {

        Human joe = new Human("Joe", 35, true, 50);
        Human cameron = new Human("Cameron", 25, false, 13);
        Human gordon = new Human("Gordon", 30, true, 30);
        Human donna = new Human("Donna", 28, false, 45);

        Innkeeper boz = new Innkeeper("Bosworth", 60, true, 0);
        Drinks brainsmasher = new Drinks("brainsmasher",20, 41);
        Drinks vodka = new Drinks("vodka",5, 10);
        Drinks tequila = new Drinks("tequila", 10, 8);
        Drinks whiskey = new Drinks("whiskey", 15, 9);
        Drinks orangeJuice = new Drinks("orange juice", 3, 0);
        Beer pilsner = new Beer("pilsner", 5, 6);
        Wine cuvee = new Wine("villanyi", 10, 3, 2001);
        Mixed kevert1 = new Mixed("fucking disgusting", pilsner, cuvee);
        Mixed kevert2 = new Mixed("ultimate brainsmasher", vodka, tequila, whiskey, brainsmasher);


        Student student1 = new Student("Billy", 18, true, 0, 80);
        Student student2 = new Student("Cassie", 23, false, 0, 100);

        Bouncer stone = new Bouncer("Stone", 48, true, 40, false);
        Bouncer larry = new Bouncer("Larry", 53, true, 80, false);
        Bouncer sarge = new Bouncer("Sarge", 42, true, 30, false);
        Bouncer duncan = new Bouncer("Duncan", 55, true, 100, false);

        joe.goingPub();
        cameron.goingPub();
        gordon.goingPub();
        donna.goingPub();
        System.out.println("\n");
        joe.drinking(boz, whiskey);
        cameron.drinking(boz, vodka);
        donna.drinking(boz, tequila);
        gordon.drinking(boz, tequila);
        cameron.drinking(boz, vodka);
        cameron.drinking(boz, vodka);
        boz.washingGlasses(1);
        System.out.println("\nWorking bouncers: " + Bouncer.workingBouncers + "\n");
        cameron.fuckingWith(donna);
        gordon.drinking(boz, brainsmasher);
        System.out.println("\n");
        sarge.goingPub();
        duncan.goingPub();
        System.out.println("\n");
        sarge.drinking(boz, vodka);
        duncan.drinking(boz, whiskey);
        sarge.startsWorking();
        sarge.drinking(boz, whiskey);
        sarge.drinking(boz);
        sarge.drinking(boz, orangeJuice);
        cameron.fuckingWith(donna);
        boz.washingGlasses(7);
        boz.washingGlasses(3);
        duncan.drinking(boz, tequila);


        System.out.println("\nStatus report:");
        System.out.println("\nBeverages:\n" + whiskey + "\n\n" + vodka + "\n\n" + tequila + "\n\n" + orangeJuice + "\n\n" + brainsmasher);
        System.out.println("\nPersons\n" + joe + "\n\n" + cameron + "\n\n" + gordon + "\n\n" + donna + "\n\n" + sarge + "\n\n" + duncan + "\n\n" + stone + "\n\n" + boz);
        System.out.println("\n" + kevert1);
        System.out.println("\n" + kevert2);

        /*
        student1.studying();
        student2.studying(0.5);
        System.out.println(student1);
        System.out.println(student2);
        */
    }
}
