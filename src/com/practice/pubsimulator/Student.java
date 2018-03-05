package com.practice.pubsimulator;

public class Student extends Human {
    private int scholarship;

    Student(String name, int age, boolean male, int money, int scholarship) {
        super(name, age, male, money);
        this.scholarship = scholarship;
    }

    public void studying() {
        setMoney(getMoney() + scholarship);
    }

    public void studying(double studyPercentage) {
        int newMoney = (int)(scholarship * studyPercentage + getMoney());
        setMoney(newMoney);
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScholarship for a full-day spent with studying: " + scholarship;
    }
}
