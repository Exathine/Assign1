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

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPasswordValidator {
	
	/*
	 * A test method that checks for a valid password length
	 * Valid password length: length > 8
	 * 
	 * Passing test: Password01
	 * Failing test: Pass01
	 * */	
	@Test
	public void testPasswordLength()
	{
		int length = PasswordValidator.getPasswordLength("Pass01");
		assertTrue("The password supplied is not long enough", length > 8);
	}
	
	/*
	 * A test method that checks for valid characters in the supplied password
	 * Valid character set: [0-9] [a-z] [A-Z]
	 * 
	 * Passing test: Password02
	 * Failing test: Password@@
	 * */
	
	@Test
	public void testPasswordCharacters()
	{
		boolean pass = PasswordValidator.checkValidPassword("Password02");
		assertTrue("Password contains invalid characters.", pass==true);
	}
	
	/*
	 * A test method that checks for a minimum of 2 digits in the supplied password
	 * 
	 * Passing test: Password03
	 * Failing test: Passwords3
	 * */
	@Test
	public void testDigits()
	{
		int n = PasswordValidator.checkDigits("Passwords3");
		assertTrue("Password requires at least 2 numbers.", n > 1);
	}
}
