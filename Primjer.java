package nastava;

import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Primjer extends JFrame{
	public Primjer(String str) {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		FlowLayout ly = new FlowLayout();
		ly.setAlignment(FlowLayout.CENTER);
		setLayout(ly);
		
		add(new JButton("kurac"));
		add(new JButton(str));
		add(new JButton("dinamo"));
		add(new JButton("mar"));
		add(new JButton("ma nemoj"));
	}
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(()-> {
				JFrame wnd = new Primjer("picka sisa");
				wnd.pack();	
				wnd.setLocation(500 , 500);
				wnd.setVisible(true);
			}
			);
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bla");

	}

}
