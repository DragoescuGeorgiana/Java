import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Main {
	static JFrame frame;
	static Puzzle[] puzzle = new Puzzle[4];
	static{
		puzzle[0] = new Puzzle(new ImageIcon(Main.class.getResource("/autumn.png")).getImage());
		puzzle[1] = new Puzzle(new ImageIcon(Main.class.getResource("/winter123.png")).getImage());
		puzzle[2] = new Puzzle(new ImageIcon(Main.class.getResource("/paris.png")).getImage());
		puzzle[3] = new Puzzle(new ImageIcon(Main.class.getResource("/cupcakes.png")).getImage());
	}
	public static void main(String[] args) {
		frame = new JFrame("Puzzle Game Project");
		frame.setSize(342, 386);
		
		
		
		JMenuBar menubar = new JMenuBar();
	    frame.setJMenuBar(menubar);
	    JMenu file = new JMenu("Meniu");
	    menubar.add(file);
	    
	    
	    JMenuItem exit = new JMenuItem("Exit");
	    exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	    file.add(exit);
	    

	  
	   
	    int index=(new Random()).nextInt(4);

		frame.add(puzzle[index]);

		frame.setLocationRelativeTo(null);

		frame.setResizable(true);
		frame.setVisible(true);

		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!puzzle[index].started)
					puzzle[index].start();
				else if (puzzle[index].mixing)
					puzzle[index].mixing = false;
				else
					puzzle[index].onClick(e);

			}
		});
	}

}