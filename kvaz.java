package apk;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class kvaz extends JPanel{
	private Integer[] niz = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private JTextField imeInput;
	private JTextField prezimeInput;
	private JTextField faksInput;
	
	private ButtonGroup gumbi;
	private JRadioButton dajeSve;
	private JRadioButton dajeSkoroSve;
	private JRadioButton nedajeSve;
	
	
	private JCheckBox sport;
	private JTextField sportIme;
	private JComboBox<Integer> brojPredmeta;
	private JComboBox<Integer> brojPolozenihPredmeta;
	

	private ButtonGroup gumbi2;
	private JRadioButton daJ;
	private JRadioButton neJ;
	
	public kvaz() {
		setLayout(new SpringLayout());
		
		//ime
		add(new JLabel("Ime: " , SwingConstants.RIGHT));
		imeInput = new JTextField();
		imeInput.setColumns(10);
		add(imeInput);
		
		//prezime
		add(new JLabel("Prezime: " , SwingConstants.RIGHT));
		prezimeInput = new JTextField();
		prezimeInput.setColumns(10);
		add(prezimeInput);
		
		//faks
		add(new JLabel("Fakultet: " , SwingConstants.RIGHT));
		faksInput = new JTextField();
		faksInput.setColumns(10);
		add(faksInput);
		
		//prolazi
		add(new JPanel());
		JPanel imeV = new JPanel();
		imeV.setBorder(BorderFactory.createTitledBorder(null, "Koliko je ispita prošao? " , TitledBorder.LEADING , TitledBorder.TOP));
		add(imeV); 
		
		imeV.setLayout(new GridLayout(0 , 1 , 0 , 0));
		gumbi = new ButtonGroup();
		
		dajeSve = new JRadioButton("Sve ili skoro sve");
		gumbi.add(dajeSve);
		imeV.add(dajeSve);
		
		dajeSkoroSve = new JRadioButton("Oko pola");
		gumbi.add(dajeSkoroSve);
		imeV.add(dajeSkoroSve);
		
		nedajeSve = new JRadioButton("Manje od pola");
		gumbi.add(nedajeSve);
		imeV.add(nedajeSve);
		
		//zenska
		add(new JPanel());
		sport = new JCheckBox("Trenira li neki sport?");
		add(sport);
		
		add(new JPanel());
		JPanel imeZ = new JPanel();
		imeZ.setBorder(BorderFactory.createTitledBorder(null, "Ime sporta:" , TitledBorder.LEADING , TitledBorder.TOP));
		add(imeZ); 
		
		sportIme = new JTextField();
		sportIme.setColumns(10);
		imeZ.add(sportIme);
		
		
		//sks
		add(new JPanel());
		JPanel imeU = new JPanel();
		imeU.setBorder(BorderFactory.createTitledBorder(null, "Spol" , TitledBorder.LEADING , TitledBorder.TOP));
		add(imeU); 
		
		imeV.setLayout(new GridLayout(0 , 1 , 0 , 0));
		gumbi2 = new ButtonGroup();
		
		daJ = new JRadioButton("muško");
		gumbi2.add(daJ);
		imeU.add(daJ);
		
		neJ = new JRadioButton("žensko");
		gumbi2.add(neJ);
		imeU.add(neJ);
		
		
		
		//broj predmeta
		add(new JLabel("Broj predmeta: " , SwingConstants.RIGHT));
		brojPredmeta = new JComboBox<Integer>(niz);
		add(brojPredmeta);
		
		//broj polozenih predmeta
		add(new JLabel("Broj polozenih predmeta: " , SwingConstants.RIGHT));
		brojPolozenihPredmeta = new JComboBox<Integer>(niz);
		add(brojPolozenihPredmeta);
				
		
		
		SpringUtilities.makeCompactGrid(this , 9 , 2 , 0 , 0 , 5 , 5);
	}
	public UserData getUserData() {
		UserData rv = new UserData();
		rv.setIme(imeInput.getText());
		rv.setPrezime(prezimeInput.getText());
		rv.setFaks(faksInput.getText());
		
		if(dajeSve.isSelected())rv.setPro(prolaz.DajeSve);
		else if(dajeSkoroSve.isSelected())rv.setPro(prolaz.DajeSkoroSve);
		else if(nedajeSve.isSelected())rv.setPro(prolaz.NeDajeSve);
		
		rv.setImaZ(sport.isSelected());
		if(sport.isSelected())rv.setImeZ(sport.getText());
		
		if(daJ.isSelected())rv.setJb(true);
		else if(neJ.isSelected())rv.setJb(false);
		
		rv.setIntl((Integer)brojPredmeta.getSelectedItem());
		rv.setSng((Integer)brojPolozenihPredmeta.getSelectedItem());
		return rv;
	}
	public void setUserData(UserData userData) {
	    imeInput.setText(userData.getIme());
	    prezimeInput.setText(userData.getPrezime());
	    faksInput.setText(userData.getFaks());
	    sport.setSelected(userData.getImaZ());
	    if(userData.getImaZ()) {
	    	sportIme.setText(userData.getImeZ());
	    }
	    else sportIme.setText(userData.getImeZ());
	    ///
	    if (userData.getPro() != null) {
	      switch (userData.getPro()) {
	      case DajeSve:
	        dajeSve.setSelected(true);
	        break;
	      case DajeSkoroSve:
		        dajeSkoroSve.setSelected(true);
		        break;
	      case NeDajeSve:
		        nedajeSve.setSelected(true);
		        break;
	      default:
	        throw new RuntimeException(
	            "UserData.EmailType is not recognized: type="
	                + userData.getPro());
	      }
	    }
	    else {
	      gumbi.clearSelection();
	    }
	    
	    ///
	    if (userData.getJb() != null) {
	    	if(userData.getJb())daJ.setSelected(true);
	    	else neJ.setSelected(true);
		}
	    else {
	    	gumbi2.clearSelection();
		}
	   
	    brojPredmeta.setSelectedItem(userData.getIntl());
	    brojPolozenihPredmeta.setSelectedItem(userData.getSng());

	}
	
}
