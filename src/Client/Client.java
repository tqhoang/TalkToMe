/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Upon successful connection to chat server, allow client(s) to chat
 */

package Client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Client extends JFrame {
	// Misc Client chat window values
	private static String CLIENT_TITLE = "TalkToMe - CLIENT";
	private int WIDTH = 640;
	private int HEIGHT = 480;
	private JPanel panel;
	
	// Text areas for the chatroom
	private JTextArea[] textAreas = new JTextArea[2];
	
	// Object streams for input and output into the chatroom
	private ObjectOutputStream output;
	private ObjectInputStream input;
	
	// Server connection variables
	private ServerSocket server;
	private Socket connection;
	
	/**
	 * Public default constructor. Calls JFrame constructor to set the window name.
	 * Initialize chat room values
	 */
	public Client() {
		// Set the title
		super(CLIENT_TITLE);		
		// Create the JFrame
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		
		createTextAreas();
		
		setVisible(true);
	}
	
	private void createTextAreas() {
		for (int index = 0; index < 2; index++) {
			textAreas[index] = new JTextArea();
		}
	}
}
