/*
 * Name: Chris Mauricio
 * Student ID: 991 296 005
 * Assignment: Assignment 1 - PasswordValidator
 * 
 * Description: The application takes a user supplied password as input
 * and validates it against 3 checks:
 * 		1) A password must have at least 8 characters
 * 		2) A password must consist only of letters and digits
 * 		3) A password must contain at least two digits
 */

package a1;

import javax.swing.JOptionPane;

public class PasswordValidator {
	
	/*
	 * Main method based off the in-class-example 'Time' class
	 * 
	 */
	public static void main(String[] args)
	{
		try
		{
			String password = JOptionPane.showInputDialog(null,
					"Please enter your password", "Enter Password",
					JOptionPane.QUESTION_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,
					"Exception: " + e.getMessage(),
					"Error",	JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//returns the length of the supplied string (password)
	public static int getPasswordLength(String password) {
		return password.length();
	}
	
	/* Checks all characters individually to be in a valid set
	 * Valid set: [0 - 9] or [a - z] or [A - Z]
	 */
	public static boolean checkValidPassword(String password)
	{
		for (int i = 0; i < password.length(); i++)
		{
			char c = password.charAt(i);
			/*
			 * [0 - 9] or [a - z] or [A - Z]
			 * check for valid characters
			 */
			if ( (c > 47 && c < 58) || (c > 64 && c < 91) || (c > 96 && c < 123) )
			{
				continue;
			}
			else
			{
				return false;				
			}
		}
		return true;
	}
	//returns the number of digits in a supplied string (password)
	public static int checkDigits(String password)
	{
		int numDigits = 0;
		for (int i = 0; i < password.length(); i++)
		{
			char c = password.charAt(i);
			//check for digits
			if ( (c > 47 && c < 58) )
			{
				numDigits++;
			}
		}
		//check if more than 2 digits
		return numDigits;
	}
}
