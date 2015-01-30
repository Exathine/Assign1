package a1;

import javax.swing.JOptionPane;

public class PasswordValidator {
	
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
	public static int getPasswordLength(String password) {
		return password.length();
	}
	
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
	//checks 
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
