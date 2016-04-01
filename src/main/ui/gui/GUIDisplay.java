package main.ui.gui;

import main.ui.util.Displayable;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

@SuppressWarnings("serial")
public class GUIDisplay extends JFrame  implements Displayable {

    private JTextField displayField;

    public GUIDisplay() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        initComponents();
        setTitle("Java Slot Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
    }

    private void initComponents() {
        displayField = new JTextField();
        displayField.setEditable(false);

        Dimension dim = new Dimension(150, 20);
        displayField.setPreferredSize(dim);
        displayField.setMinimumSize(dim);


        //JLabel and JTextField panel
        JPanel dataPanel = new JPanel();
        dataPanel.setLayout(new GridBagLayout());
        dataPanel.add(new JLabel("Message:"),
                getConstraints(0, 0, GridBagConstraints.LINE_START));
        dataPanel.add(displayField,
                getConstraints(1, 0, GridBagConstraints.LINE_START));
        add(dataPanel, BorderLayout.CENTER);
        pack();
    }

    // Helper method to return GridBagConstraints objects
    private GridBagConstraints getConstraints(int x, int y, int anchor) {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        c.anchor = anchor;
        return c;
    }

	@Override
	public void display(String itemToDisplay) {
		displayField.setText(itemToDisplay);
	}

}