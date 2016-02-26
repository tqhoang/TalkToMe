/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: 26 February 2016
 * Description: Launches the client application.
 */

package Client;

import javax.swing.JFrame;

public class ClientLauncher {
	/**
	 * Main entry point of the program. Launches the login to prompt the user for necessary
	 * information, such as username, chatroom name, and address to connect.
	 * @param args - Not used within the program
	 */
	public static void main(String[] args) {
		Login login = new Login();
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
