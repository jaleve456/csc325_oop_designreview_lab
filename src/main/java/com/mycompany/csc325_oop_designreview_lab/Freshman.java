package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;
    private String address;

    public Freshman(String name, short age, double GPA, int credits) { //constructor for Freshman class
        super(name,age,GPA);
        this.credits = credits;
    }

    public int getCredits() { //getter method for credits
        return credits;
    }

    public void setCredits(int credits) { //setter method for credits
        this.credits = credits;
    }

    @Override //overrides abstract method from Human
    public String toString() {
        return "Freshman: Name = '" + getName() + "', Age = " + getAge() + ", GPA = " + getGPA() + ", Credits = " + getCredits();
    }

    @Override //overrides abstract method from Human
    public String getAddress() {
        return address;
    }

    @Override //overrides abstract method from Human
    public void setAddress(String address) {
        this.address = address;
    }
}
