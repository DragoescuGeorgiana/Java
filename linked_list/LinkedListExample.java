package linked_list;

// Create an ArrayList in which you add Persoane(Somer, Angajat, Student); 
//iterate through the ArrayList and print the name of each person.
//Do the same with a LinkedList


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> student = new LinkedList<String>();  // Declararea listei LinkedList

		// add(String Element) este folosita pentru adaugarea elementelor in lista LinkedList
		student.add("Popescu");
		student.add("Mihaescu");
		student.add("Anescu");

		System.out.println(student); // Afiseaza continutul listei LinkedList

		Collections.sort(student);  // Apeleaza metoda statica
					// 'Collections.sort()',
					// apoi afiseaza din nou lista de cantece.
					// Metoda 'Collections.sort()' ordoneaza
					// alfabetic o lista de obiecte String . 
		System.out.println(student);// A doua oara lista este afisata in ordine
					// alfabetica

	}

}
