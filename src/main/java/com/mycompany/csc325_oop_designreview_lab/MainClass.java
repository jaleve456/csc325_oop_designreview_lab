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
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name for Freshman: ");
		String name = sc.nextLine();

		System.out.println("Enter age for Freshman: ");
		short age = sc.nextShort();

		System.out.println("Enter GPA for Freshman: ");
		double GPA = sc.nextDouble();

		System.out.println("Enter credits for Freshman: ");
		int credits = sc.nextInt();

		Freshman freshman = new Freshman(name, age, GPA, credits); // name, age, credits


		System.out.println("Enter first name for Senior: ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter age for Senior: ");
		age = sc.nextShort();

		System.out.println("Enter GPA for Senior: ");
		GPA = sc.nextDouble();

		System.out.println("Enter credits for Senior: ");
		int seniorCredits = sc.nextInt();

		if (seniorCredits >= 85) {
			System.out.println("Senior must have at least 85 credits");
		}

		Senior senior = new Senior(name, age, GPA, seniorCredits);
		System.out.println(freshman);
		System.out.println(senior);

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