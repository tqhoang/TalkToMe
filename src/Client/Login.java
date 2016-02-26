/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Acquire login credentials and establishes connection
 */

package Client;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Utils.TextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	// Login class UI variables
	private String TITLE = "TalkToMe - LOGIN";
	private int WIDTH = 400;
	private int HEIGHT = 200;
	private int COLUMNS = 18;
	private JPanel panel;
	
	// Connection variables
	public static String USERNAME = "";
	public static String SERVER = "";
	public static String PORT = "";
	
	private JLabel usernameL;
	private JLabel serverL;
	private JLabel portL;
	
	private TextField username;
	private TextField server;
	private TextField port;
		
	/**
	 * Public constructor for Login.
	 * Sets JFrame and JPanel values and initializes class variables.
	 */
	public Login() {
		// set JFrame values
		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets(2, 2, 2, 2);
		
		// Create the labels for text fields
		usernameL = new JLabel("Username: ");
		serverL = new JLabel("Server: ");
		portL = new JLabel("Port: ");
		
		// Create a text field for the username
		username = new TextField("ex  John Smith", USERNAME);
		username.setColumns(COLUMNS);
		// Create text field for the server name
		server = new TextField("ex  127.0.0.1", SERVER);
		server.setColumns(COLUMNS / 2);
		// Create text field for the port
		port = new TextField("ex  1337", PORT);
		port.setColumns(COLUMNS / 3);
		
		// Create a JPanel to store text fields, then add the panel to JFrame
		panel = new JPanel();
		// Username assets
		panel.add(usernameL);
		panel.add(username);
		// Server assets
		panel.add(serverL);
		panel.add(server);
		// Port assets
		panel.add(portL);
		panel.add(port);
		add(panel);
		
		setVisible(true);
	}
}