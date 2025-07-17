package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student { //inherits traits from Student class
    private int seniorCredits; //sets specfic credit attribute for Senior class
    private String address;

    public Senior (String name, short age, double GPA, int seniorCredits) { //constructor method for Senior class
        super(name,age,GPA); //gets attributes for Student superclass
        if (seniorCredits >= 85) { //sets a minimum value of 85 to seniorCredits 
            this.seniorCredits = seniorCredits;
        } else {
            throw new IllegalArgumentException("Senior must have at least 85 credits"); //throws an exception is seniorCredits does not meet the minimum requirement of 85 credits
        }
    }

    public int getSeniorCredits() { //getter method for credits
        return seniorCredits;
    }

    public void setSeniorCredits(int seniorCredits) { //setter method for credits
        if (seniorCredits >= 85) { //sets a minimum value of 85 to seniorCredits 
            this.seniorCredits = seniorCredits;
        } else {
            throw new IllegalArgumentException("Senior must have at least 85 credits"); //throws an exception is seniorCredits does not meet the minimum requirement of 85 credits
        }
        }
    }
    @Override //overrides abstract method in Human class
    public String toString() {
        return  "Senior: Name = '" + getName() + "', Age = " + getAge() + ", GPA = " + getGPA() + ", Credits = " + getSeniorCredits(); //returns this format when Senior object is called in MainClass.java
    }

    @Override //overrides abstract method in Human class
    public String getAddress() {
        return address;
    }

    @Override //overrides abstract method in Human class
    public void setAddress(String address) {
        this.address = address;
    }



}
