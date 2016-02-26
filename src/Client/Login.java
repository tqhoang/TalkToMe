/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Acquire login credentials and establishes connection
 */

package Client;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Utils.TextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	// Login class UI variables
	private String TITLE = "TalkToMe - LOGIN";
	private int WIDTH = 300;
	private int HEIGHT = 200;
	private int COLUMNS = 12;
	private JPanel panel;
	
	// Connection variables
	public static String USERNAME = "";
	public static String SERVER = "";
	public static String PORT = "";
	
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
		setVisible(true);
		
		// Create a text field for the username
		username = new TextField("Username", USERNAME);
		username.setColumns(COLUMNS);
		// Create text field for the server name
		server = new TextField("Server", SERVER);
		server.setColumns(COLUMNS);
		// Create text field for the port
		port = new TextField("Port", PORT);
		port.setColumns(COLUMNS / 2);
		
		// Create a JPanel to store text fields, then add the panel to JFrame
		panel = new JPanel();
		panel.add(username);
		panel.add(server);
		panel.add(port);
		add(panel);
	}
}