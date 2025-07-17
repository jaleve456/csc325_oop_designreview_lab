package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int seniorCredits;
    private String address;

    public Senior (String name, short age, double GPA, int seniorCredits) { //constructor method for Senior class
        super(name,age,GPA);
        if (seniorCredits >= 85) {
            this.seniorCredits = seniorCredits;
        } else {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
    }

    public int getSeniorCredits() { //getter method for credits
        return seniorCredits;
    }

    public void setSeniorCredits(int seniorCredits) { //setter method for credits
        if (seniorCredits >= 85) {
            this.seniorCredits = seniorCredits;
        } else {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
    }
    @Override
    public String toString() {
        return  "Senior: Name = '" + getName() + "', Age = " + getAge() + ", GPA = " + getGPA() + ", Credits = " + getSeniorCredits();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }



}
