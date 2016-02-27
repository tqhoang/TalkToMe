/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Acquire login credentials and establishes connection
 */

package Client;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Utils.TextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	// Login class UI variables
	private String TITLE = "TalkToMe - LOGIN";
	private int WIDTH = 300;
	private int HEIGHT = 150;
	private int COLUMNS = 12;
	private JPanel panel;
	
	// Connection variables
	public static String USERNAME;
	public static String SERVER;
	public static String PORT;
	// Instruction labels
	private JLabel[] labels = new JLabel[3];
	// Connection text fields
	private TextField[] textFields = new TextField[3];
		
	/**
	 * Public constructor for Login.
	 * Sets JFrame and JPanel values and initializes class variables.
	 */
	public Login() {
		// set JFrame values
		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		
		// Initialize labels and text fields for use
		createLabels();
		createTextFields();
		
		// Create a JPanel to store text fields and labels
		panel = new JPanel(new BorderLayout());
		panel.setLayout(new GridBagLayout());
		// Create a Grid Bag Layout for labels
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		createGridLayout(panel, gbc);
		add(panel);
		pack();
		setVisible(true);
	}
	
	/**
	 * Called in constructor. Used to initialize labels in their respective indexes in
	 * the labels array. Must be called before createGridLayout()
	 * Index 0 = user name
	 * Index 1 = server
	 * Index 2 = port
	 */
	private void createLabels() {
		// Create the user name label
		labels[0] = new JLabel("Username:");
		// Create the server label
		labels[1] = new JLabel("Server:");
		// Create the port label
		labels[2] = new JLabel("Port:");
	}
	
	/**
	 * Called in constructor. Used to initialize text fields for client usage, stored
	 * within the textFields array. 
	 * Index 0 = user name
	 * Index 1 = server
	 * Index 2 = port
	 */
	private void createTextFields() {
		// Create text field for the user name
		textFields[0] = new TextField("ex. Talker24", USERNAME);
		textFields[0].setColumns(COLUMNS);
		// Create text field for the server name
		textFields[1] = new TextField("ex. 127.0.0.1", SERVER);
		textFields[1].setColumns(COLUMNS * (2/3));
		// Create text field for the port
		textFields[2] = new TextField("ex. 3333", PORT);
		textFields[2].setColumns(COLUMNS / 2);
	}
	
	/**
	 * Called within the constructor. Used to create the GridBagConstraints.
	 * Adds user name, server, and port labels and text fields to the frame
	 * @param panel - The panel to which assets will be added
	 * @param gbc - GridBagConstraints to which assets are designed in
	 */
	private void createGridLayout(JPanel panel, GridBagConstraints gbc) {
		// Initialize gbc positions to 0
		gbc.gridx = gbc.gridy = 0;
		
		// For every label and text field, position and add them to the panel appropriately
		for (int index = 0; index < labels.length; index++) {
			gbc.gridx = 0;
			gbc.anchor = GridBagConstraints.EAST;
			panel.add(labels[index], gbc);
			gbc.gridx++;
			gbc.anchor = GridBagConstraints.WEST;
			panel.add(textFields[index], gbc);
			gbc.gridy++;
		}
		gbc.anchor = GridBagConstraints.EAST;
		gbc.weightx = 1;
		JButton login = new JButton();
		login.setText("Login");
		panel.add(login, gbc);
	}
}