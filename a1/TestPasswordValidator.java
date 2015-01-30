package a1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPasswordValidator {
	@Test
	public void testPasswordLength()
	{
		int length = PasswordValidator.getPasswordLength("Password01");
		assertTrue("The password supplied is not long enough", length > 8);
	}
	
	@Test
	public void testPasswordCharacters()
	{
		boolean pass = PasswordValidator.checkValidPassword("Password@@");
		assertTrue("Password contains invalid characters.", pass==true);
	}
	@Test
	public void testDigits()
	{
		int n = PasswordValidator.checkDigits("Password03");
		assertTrue("Password requires at least 2 numbers.", n > 1);
	}
}
