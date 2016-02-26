/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Acquire login credentials and establishes connection
 */

package Client;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Utils.TextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	// Login class UI variables
	private String TITLE = "TalkToMe - LOGIN";
	private int WIDTH = 300;
	private int HEIGHT = 200;
	private int COLUMNS = 12;
	private JPanel panel;
	
	// User variables
	public static String USERNAME = "";
	
	// Connection variables
	static int PORT;
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
		
		// JPanel
		panel = new JPanel();
		
		// Create a text field for the username
		username = new TextField("Username", USERNAME);
		username.setColumns(COLUMNS);
		
		panel.add(username, BorderLayout.CENTER);
		
		add(panel);
	}
}