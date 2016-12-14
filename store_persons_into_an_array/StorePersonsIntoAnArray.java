package store_persons_into_an_array;

import java.util.ArrayList;

// Create an array in which you store Persoane(Somer, Angajat, Student);
// iterate through the array and print the name of each person


public class StorePersonsIntoAnArray {

	public static void main(String[] args) {

		Student s1 = new Student("Popescu");
		Student s2 = new Student("Popescu1");
		Student s3 = new Student("Popescu2");

		ArrayList<Student> student = new ArrayList<Student>();

		student.add(s1);
		student.add(s2);
		student.add(s3);

		System.out.println("First student: " + s1.name + "\n" + "Second student: " + s2.name + "\n"
				+ "The third student: " + s3.name);
		
		
		System.out.println("_____________________" + "\n");
		

		Angajat a1 = new Angajat("Popescu3");
		Angajat a2 = new Angajat("Popescu4");
		Angajat a3 = new Angajat("Popescu5");

		ArrayList<Angajat> angajat = new ArrayList<Angajat>();

		angajat.add(a1);
		angajat.add(a2);
		angajat.add(a3);

		System.out.println("First employee: " + a1.name + "\n" + "Second employee: " + a2.name + "\n"
				+ "Third employee: " + a3.name);

	}

}
