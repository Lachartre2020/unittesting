package fr.wildcodeschool.unittesting;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
/*	@Test
	public void testVowels() {
		Assert.assertEquals(StringUtils.vowels("azerty"),"aey" );
    } */
	
	@Test
	public void testUniqueVowels() {
		Assert.assertEquals(StringUtils.uniqueVowels("azerty"),"aey" );
		Assert.assertEquals(StringUtils.uniqueVowels("azeerty"),"aey" );
		Assert.assertEquals(StringUtils.uniqueVowels("aazertyy"),"aey" );
		Assert.assertEquals(StringUtils.uniqueVowels("zrt"),"" );		
		Assert.assertEquals(StringUtils.uniqueVowels(""),"" );	
		Assert.assertEquals(StringUtils.uniqueVowels(null),"" );		
    }

	
}
