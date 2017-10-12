import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		
		
		fail("Not yet implemented");
	}
	
	@Test
	public void basic_RomantoArabicTest()
	{
		//Arrange
		RomanNumerals r = new RomanNumerals();
				
				
		//Assert
		assertEquals("wrong conversion",1 ,r.convert("I"));	
	}
	
	{
		//Arrange
		RomanNumerals r = new RomanNumerals();
				
				
		//Assert
		assertEquals("wrong conversion",5 ,r.convert("V"));			
		
	}
	
	{
		//Arrange
		RomanNumerals r = new RomanNumerals();
		
		
		//Assert
		assertEquals("wrong conversion",10 ,r.convert("X"));
	
	}
	
	{
		//Arrange
		RomanNumerals r = new RomanNumerals();
				
				
		//Assert
		assertEquals("wrong conversion",50 ,r.convert("L"));
	}
	
	{
		//Arrange
		RomanNumerals r = new RomanNumerals();
				
				
		//Assert
		assertEquals("wrong conversion",100 ,r.convert("C"));
	}
	
	@Test 
	public void test_C_is_not_50()
	{
		//Arrange
				RomanNumerals r = new RomanNumerals();
				
				
				//Assert
				assertEquals("wrong conversion",50 ,r.convert("C"));
	}

	@Test
	public void test_less_than_ten()
	{
		//Arrange
				RomanNumerals r = new RomanNumerals();
				
				
				//Assert
				assertEquals("wrong conversion",8 ,r.convert("VIII"));
	}
}
