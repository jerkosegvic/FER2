package nastava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Prim2 extends JFrame{
	public Prim2(String str) {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(10 , 10 , 500 , 200);
		JPanel pan = (JPanel)getContentPane();
		pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		JLabel lb = new JLabel("gumb " + str);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		pan.add(lb, BorderLayout.NORTH);
		
		JLabel lblName = new JLabel("kako se zoveš? ");
		pan.add(lblName, BorderLayout.WEST);
		
		JTextField inp = new JTextField();
		pan.add(inp , BorderLayout.EAST);
		inp.setColumns(10);
		///BorderLayout ly = new BorderLayout();
		///ly.setAlignment(FlowLayout.CENTER);
		//setLayout(new GridLayout(0 , 2));
		
		JPanel southPanel = new JPanel();
		pan.add(southPanel, BorderLayout.SOUTH);
		JButton btnOK = new JButton("utipko sam");
		southPanel.add(btnOK);
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(Prim2.this,
			"poydrav " + inp.getText());
			}
			});
		
		/*
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 500, 200); // postavljanje lokacije i veličine
		JPanel panel = (JPanel) getContentPane(); // ovo je potrebno zbog okvira
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		JLabel lblTitle = new JLabel("kurac" + str);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTitle, BorderLayout.NORTH);
		JLabel lblName = new JLabel("Unesite ime i prezime:");
		panel.add(lblName, BorderLayout.WEST);
		JTextField tfInput = new JTextField();
		panel.add(tfInput, BorderLayout.CENTER);
		tfInput.setColumns(10);
		JPanel southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);
		JButton btnOK = new JButton("OK");
		southPanel.add(btnOK);*/
	}
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(()-> {
				Prim2 wnd1 = new Prim2("picka sisa");
				wnd1.pack();	
				wnd1.setLocation(800 , 500);
				wnd1.setVisible(true);
			}
			);
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("blabla");

	}

}
