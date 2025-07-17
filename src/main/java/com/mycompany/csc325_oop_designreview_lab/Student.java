/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Student extends Human { //inherits traits from Human class
    private double GPA; //private keyword represents attribute with restricted access

    public Student(String name, short age, double GPA) { //constructor for student class
        super(name,age); //gets name and age attribute from Student superclass
        this.GPA = GPA; //defines the GPA value within this specific file
    }

    public double getGPA() { //getter method for GPA
        return GPA;
    }
    public void setGPA(double GPA) { //setter method for GPA
        this.GPA = GPA;
    }
    @Override
    public String toString() { //method that generates text representation of java class
        return "Student{Name='" + getName() + "', Age=" + getAge() + ", GPA=" + GPA + "}";
    }

}

// Self-Checklist //
// ToDo 1: Make this class a child of Human

// ToDo 2: Fix the resulting errors

// ToDo 3: Add a field for GPA and create a setter and a getter

// ToDo 4: Add comments to your code
