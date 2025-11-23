package person_info_app;

import java.util.Scanner;
import java.io.PrintStream;

//Created Person Class with Attributes
class Person{
	String First, Last, gender, height, ethnicity, religion;
	int age, weight;
}

public class Person_Info_APP {

	static Scanner usin = new Scanner(System.in);
	public static void main(String[] args) {
		//Creating variables and new objects
		PrintStream so = System.out;
		Person person1 = new Person();
		
		//Getting information for the object from user
		so.println("Please enter the information about the Person.");
		so.print("First Name: ");
		person1.First = usin.next();
		so.print("Last Name: ");
		person1.Last = usin.next();
		so.print("Gender: ");
		person1.gender = usin.next();
		so.print("Age: ");
		person1.age = usin.nextInt();
		so.print("Weight: ");
		person1.weight = usin.nextInt();
		so.print("Height: ");
		person1.height = usin.next();
		so.print("Ethnicity: ");
		person1.ethnicity = usin.next();
		so.print("Religion: ");
		person1.religion = usin.next();
		
		//Printing the person out
		so.printf("Full Name: %S %S\nGender: %S\nAge: %d\nWeight: %d\nHeight: %S\nEthnicity: %S\nReligion: %S"
				, person1.First, person1.Last, person1.gender, person1.age, person1.weight, person1.height, person1.ethnicity, person1.religion);
	}
}
