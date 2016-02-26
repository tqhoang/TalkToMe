/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Acquire login credentials and establishes connection
 */

package Client;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	// Login class UI variables
	private String TITLE = "TalkToMe - LOGIN";
	private int WIDTH = 400;
	private int HEIGHT = 300;
	
	// User variables
	static String USERNAME;
	
	// Connection variables
	static int PORT;
	private JTextField username;
	private JTextField server;
	private JTextField port;
	
			
	public Login() {
		
	}
}