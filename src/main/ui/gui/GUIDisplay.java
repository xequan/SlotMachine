package main.ui.gui;

import main.business.Spinner;
import main.ui.util.Displayable;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class GUIDisplay extends JFrame {

	//Thing the Frame has...
	private JPanel mainPanel;
	private JPanel spinnerPanel;
	private JPanel betPanel;
	private JPanel bottomStuff;
	private JTextField genericSpinner;
	private JTextField spinnerOne;
	private JTextField spinnerTwo;
	private JTextField spinnerThree;
	private JButton betButton;
	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;
	


	public GUIDisplay() {
		// Set look and feel to operating system/computer
		try {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		// Set general parameters like title, size, position
		setTitle("Slot Machine");
		setSize(200, 200);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the inside of the Frame
		add(buildSpinnerPanel(), BorderLayout.NORTH);
		add(buildBetPanel(), BorderLayout.CENTER);
		setVisible(true);        

		spinner1.setRunTime(100);
		spinner2.setRunTime(50);
		spinner3.setRunTime(10);

	}

	// Build the Spinner panel
	private JPanel buildSpinnerPanel() {
		spinnerPanel = new JPanel();

		spinnerOne = buildSpinner();
		spinnerTwo = buildSpinner();
		spinnerThree = buildSpinner();

		spinner1 = new Spinner();
		spinner2 = new Spinner();
		spinner3 = new Spinner();

		spinner1.setSpinnerField(spinnerOne);
		spinner2.setSpinnerField(spinnerTwo);
		spinner3.setSpinnerField(spinnerThree);
		
		

		spinnerOne = spinner1.getSpinnerField();
		spinnerTwo = spinner2.getSpinnerField();
		spinnerThree = spinner3.getSpinnerField();
		
		

		spinnerPanel.add(spinnerOne);
		spinnerPanel.add(spinnerTwo);
		spinnerPanel.add(spinnerThree);
		
		spinnerOne.setEditable(false);
		
		spinnerTwo.setEditable(false);
		spinnerThree.setEditable(false);
		

		return spinnerPanel;
	}

	// Build TextField for Spinner
	private JTextField buildSpinner() {
		genericSpinner = new JTextField();
		Dimension shortField = new Dimension(20, 20);
		genericSpinner.setPreferredSize(shortField);
		genericSpinner.setMinimumSize(shortField);

		return genericSpinner;
	}

	// Build the Bet Panel
	private JPanel buildBetPanel() {
		betPanel = new JPanel();

		// Generate Bet Button
		betButton = new JButton("Bet");
		betButton.addActionListener((ActionEvent) -> {
            doBetButton();
        });
		
		betPanel.add(betButton);
		
		return betPanel;
	}

	//Bet Button Listener

	private void doBetButton() {
		spinner1.start();
		spinner2.start();
		spinner3.start();
    }
	
}