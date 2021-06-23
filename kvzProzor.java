package apk;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class kvzProzor extends JFrame{
	private kvaz k;
	
	public kvzProzor(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLayout(new BorderLayout());
		 
		 k = new kvaz();
		 add(k , BorderLayout.CENTER);
		 
		 //buttons
		 JPanel gumbi = new JPanel();
		 add(gumbi , BorderLayout.SOUTH);
		 
		 JPanel gumbi2 = new JPanel();
		 gumbi2.setLayout(new GridLayout(1 , 0 , 10 , 0));
		 gumbi.add(gumbi2);
		 
		 //ok gumb
		 JButton btOk = new JButton("Dodaj");
		 gumbi2.add(btOk);
		 
		 //cancle gumb
		 JButton btCnl = new JButton("Odustani");
		 gumbi2.add(btCnl);
		 
		 //actions
		 btOk.addActionListener((e)->{
			 UserData data = k.getUserData();
			 
			 System.out.println(data);
		 });
		 btCnl.addActionListener((e)->{
			 System.exit(0);
		 });
	}
	
	public kvaz getK(){
		return k;
	}
}
