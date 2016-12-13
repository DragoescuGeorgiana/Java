import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Puzzle extends JPanel {
	private static final long serialVersionUID = 1L;
// clasa  Puzzle declara doua variabile de instanta 
	Segment[] segments;			//declara o matrice de obiecte Sement			 
	Image img;
	
	public boolean started = false;
	public boolean mixing = false;
	
	
	//adauga un parametru de tip Imagine in constructorul Puzzle
	public Puzzle(Image img) {
		this.img = img;		//"this.img" face referire la obiectul curent "Puzzle"
		segments = new Segment[9];		//creeaza o matrice de obiecte Sement pentru a stoca 9 referinte 
		int segmentSize = img.getWidth(null)/3;		 
		for (int i = 0; i != segments.length; i++) {
			//initializare	   verifica		  operator de post-incrementare, expresie de iterare
						   //  daca valorile 
						    // celor doi operanzi sunt 
						     //egale sau nu, 
							 //in cazul in care 
						     //valorile nu sunt egale, 
						     //atunci conditia 
						     //devine adevarata
							 //"length" furnizeaza numarul de elemente ale matricei "segment"
			
			
			segments[i] = new Segment(this, i, segmentSize);	// creeaza obiectul "segment"  din matricea de tip "segment"
		}
	}
	
	public void start() {		// este apelata metoda start()  a thread-ului intr-o cale separata de executie, apoi invoca metoda run()	
		started = true;
		segments[8].isEmpty = true;		// metoda isEmpty () returneaza true, in cazul in care lista nu contine niciun element ( adica  length() trebuie sa fie 0 ) 
		mix.start();		// apeleaza metoda start()  a  var mix
	}
	
	Thread mix = new Thread(new Runnable() {	// Thread-urile folosesc interfata Runnable pentru a apela metoda run().
		public void run() {
			mixing = true;
			while (mixing) {
				ArrayList<Integer> possibleMovements = new ArrayList<Integer>();	//adauga un numar intreg intr-un ArrayList  ( creaza un ArrayList pentru matrici de numere intregi)
				
				
				//caracterul ":" - "in"
					      //   |
				for (Segment s : segments) {
				   //  |     |        |
			// elementele  declara   colectia de elemente pe care vrei sa o parcurgi iterativ
			//din matrice	 o		 
			// trebuie sa  variabila 
			// fie         de iterare
			// compatibile  care va
			// cu tipul    stoca un
			// variabilei   element
			// declarate   din matrice
						  // De fiecare
					      // data cand
					         //este
					       //parcursa
					       //matricea,
					        //un alt
					       //element 
					      //al matricei
					     //este atribuit
					      // variabilei
					         //   s
					
					
					
					//inregistreaza toate mutarile posibile din jurul obiectului, 
					//pozitia actuala la dreapta, la stanga, sus si jos din jurul obictului 
					if (s.getPosition().x == segments[8].getPosition().x+1 && s.getPosition().y == segments[8].getPosition().y) possibleMovements.add(s.getID());	// la dreapta
					if (s.getPosition().x == segments[8].getPosition().x-1 && s.getPosition().y == segments[8].getPosition().y) possibleMovements.add(s.getID());	//la stanga
					if (s.getPosition().x == segments[8].getPosition().x && s.getPosition().y == segments[8].getPosition().y-1) possibleMovements.add(s.getID());	// sus 
					if (s.getPosition().x == segments[8].getPosition().x && s.getPosition().y == segments[8].getPosition().y+1) possibleMovements.add(s.getID());	//jos
				}			

					  
				
									
				int index = (int) ((Math.random()*possibleMovements.size()));
				try {
					Point temporary = segments[possibleMovements.get(index)].getPosition();
					segments[possibleMovements.get(index)].setPosition(segments[8].getPosition());
					segments[8].setPosition(temporary);
				} catch (Exception e) {}
				repaint();
				try {
					Thread.sleep(100);		// pauza pentru 0.1 secunde
				} catch (InterruptedException e) {}
			}
		}
	});
	
	public void onClick(MouseEvent e) {	// metoda apelata dupa ce utilizatorul face click pe componenta
		for (Segment s : segments) {
			if (s.hitten(e.getPoint())) {  // daca segmentul este selectat, returneaza pozitia in raport cu componenta sursa	
				Point temporary = s.getPosition(); 
				if (s.move(segments[8].getPosition())) {
					segments[8].setPosition(temporary);
					
					
					boolean done = true;
					for (int i = 0; i != 9; i++) {
						if (segments[i].getPosition().x == ((i <= 2)? i:(i <= 5)? (i-3):(i-6)) && segments[i].getPosition().y == (int) Math.ceil((i/3))) {
						} else {
							done = false;
						}
					}
					
					if (done) {
						started = false;
						segments[8].isEmpty = false;
					}
				}
			}
		}
		repaint();
	}
	
	public void paint(Graphics g) {		//initializeaza graficul
		super.paint(g);
		for (int i = 0; i != segments.length; i++) {
			System.out.print(segments[i].getID()+((i == 2 || i == 5 || i == 8)? "\n-----\n":"|"));
													// delimiteaza matricea 
			segments[i].paint(g);				
		}
	}
	
}