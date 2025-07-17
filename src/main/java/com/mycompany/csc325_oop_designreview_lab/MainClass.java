/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;


/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creates object of Scanner class to recieve user input

		System.out.println("Enter first name for Freshman: "); //prompts user to enter Freshman name
		String name = sc.nextLine(); //allows user input for name String

		System.out.println("Enter age for Freshman: "); //prompts user to enter Freshman age
		short age = sc.nextShort(); //allows user input for age

		System.out.println("Enter GPA for Freshman: "); //prompts user to enter Freshman GPA
		double GPA = sc.nextDouble(); //allows user input for GPA

		System.out.println("Enter credits for Freshman: "); //prompts user to enter Freshman credits
		int credits = sc.nextInt(); //allows user input for credits

		Freshman freshman = new Freshman(name, age, GPA, credits); // object of Freshman class that takes in name, age, GPA, and credits as parameters


		System.out.println("Enter first name for Senior: ");  //prompts user to enter Senior name
		sc.nextLine();
		name = sc.nextLine(); //allows user input for name String

		System.out.println("Enter age for Senior: ");  //prompts user to enter Senior age
		age = sc.nextShort(); //allows user input for age

		System.out.println("Enter GPA for Senior: "); //prompts user to enter Senior GPA
		GPA = sc.nextDouble(); //allows user input for GPA

		System.out.println("Enter credits for Senior: "); //prompts user to enter Senior credits
		int seniorCredits = sc.nextInt(); //allows user input for credits

		if (seniorCredits >= 85) {
			System.out.println("Senior must have at least 85 credits");
		}

		Senior senior = new Senior(name, age, GPA, seniorCredits); // object of Senior class that takes in name, age, GPA, and seniorCredits as parameters
		System.out.println(freshman); //outputs Freshman credentials
		System.out.println(senior); //outputs Senior credentials

	}

}
//Self checklist //
// ToDo 5: Fix the error

// ToDo 6: Fix the constructor of the Student class

// Todo 7: Create two classes for Freshman and Senior

// ToDo 8: The senior class should have a minimum of 85 credits

// ToDo 9: Add a toString method for the Student class
// ToDo 10: Add a toString method for the Freshman class
// ToDo 11: Add a toString method for the Senior class
// ToDo 12: Set the gpa of the student using the scanner and user
// 			input and then print the output.
// ToDo 13: add comments and explain your code
