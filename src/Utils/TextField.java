/**
 * Author: Trung Hoang
 * Email: tqhoang.ca@gmail.com
 * Date: February 26, 2016
 * Description: Text Field class that extends JTextField and implements FocusListener. Created
 * 				for implementing multiple textfields with the same functionality. Contains a
 * 				constructor that initializes JTextField values and class values, and defined
 * 				focusGained and focusLost methods to be automatically added to TextFields
 */

package Utils;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextField extends JTextField implements FocusListener {
	// Default text in the text field when not in focus
	private String DEFAULT_STRING;
	private String EDIT_STRING;
	
	// Text color for the field
	private final Color ACTIVE = Color.black;
	private final Color INACTIVE = Color.gray;
	
	/**
	 * Public constructor for TextField
	 * Call the JTextField constructor and initialize DEFAULT_STRING and EDIT_STRING
	 * Make the focusGained and focusLost methods usable
	 * @param d - The default text to be displayed when out of focus
	 * @param e - The text variable to be edited
	 */
	public TextField(String d, String e) {
		super();
		DEFAULT_STRING = d;
		EDIT_STRING = e;
		addFocusListener(this);
		
		//setText(DEFAULT_STRING);
	}
	
	/**
	 * When the text field is selected, allow editing and set the text color to black.
	 * If a text to be edited is empty, clear. Otherwise, allow continued editing.
	 */
	@Override
	public void focusGained(FocusEvent e) {
		setForeground(ACTIVE);
		setEditable(true);
		setText(EDIT_STRING);
	}

	/**
	 * When the text field is deselected, disable editing and set the text color to gray.
	 * Set the text to be edited to the current string in the field.
	 * If the field is currently empty, display the default message.
	 * If the field contains a string, display the string instead.
	 */
	@Override
	public void focusLost(FocusEvent e) {
		setForeground(INACTIVE);
		EDIT_STRING = getText();
		// If the text field is empty, display the default string
		if (getText().isEmpty()) {
			setText(DEFAULT_STRING);
		}
		// Otherwise, display the edited string
		else {
			setText(EDIT_STRING);
		}
		setEditable(false);
	}

}
