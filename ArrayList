package arrayList;

import java.util.ArrayList;

public class Carte {

	public static void main(String[] args) {

		ArrayList<Carte> listaMeaDeCarti = new ArrayList<Carte>();   // in zona
						                                                     // heap este
                                                                // creat un nou
                                                                // obiect ArrayList.
                                                                // Este micut
                                                                // deoarece nu
                                                                // contine nimic
		Carte s = new Carte(); // Acum obiectul ArrayList creste devenind o 
								          // "casuta" in care este pastrat obiectul "Carte"
                          
		listaMeaDeCarti.add(s); // adaugam in lista obiectul furnizat ca
                            // parametru
                            // ( obiectul "Carte" )

		Carte b = new Carte(); // adaugam inca un obiect "Carte"
		listaMeaDeCarti.add(b); // Acum obiectul creste din nou pentru a face
								            // loc celui de-al doilea obiect "Carte"

		int marime = listaMeaDeCarti.size(); // aflam cate obiecte contine
												// lista.
												// Obiectul ArrayList contine
												// doua
												// obiecte, asa ca metoda 
												// " size() "
												// returneaza valoarea 2

		boolean esteCeva = listaMeaDeCarti.contains(s); // lista ArrayList
														// contine
														// obiectul referit 's',
														// asa ca  metoda
														// " contains() "
														// returneaza valoarea
														// 'true'

		int index = listaMeaDeCarti.indexOf(b); // aflam indicele unui obiect.
												// Lista ArrayList porneste de
												// la indicele 0 si deoarece
												// obiectul referit de 'b' a
												// fost adaugat al doilea,
												// metoda " indexOf() "
												// returneaza valoarea 1

		boolean nimic = listaMeaDeCarti.isEmpty(); // aflam daca lista contine
													// sau
													// nu vreun element.
													// Cu siguranta lista NU
													// este vida, asa ca metoda
													// " isEmpty() " returneaza
													// valoarea 'false'

		listaMeaDeCarti.remove(s); // sterge din lista obiectul aflat la
									// indicele
									// furnizat ca parametru.
									// Lista s-a micsorat, a fost sters obiectul
									// aflat la indicele 's'

		System.out.println("Lista are doua obiecte: 's' si 'b'" + "\n" + "Marimea listei: " + marime + "\n"
				+ "Lista contine " + marime + " obiecte: " + esteCeva + "\n" + "Obiectul 'b' se afla la indicele: "
				+ index + "\n" + "Lista nu contine elemente: " + nimic + "\n"
				+ "Lista s-a micsorat, a fost sters obiectul aflat la indicele: 's' ");
	}

}
