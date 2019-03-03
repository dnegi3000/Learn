/**
 * 
 */
package my.work.clencd.lycrel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author deenegi0
 *
 */
public class LycrelTest {

	@Test
	public void facts() throws Exception{
		
	}
		
	@Test
	public void testISPalildrome() {
		             
				assertEquals(true,  Lycrel.idPalindrome(1));
				assertEquals(true , Lycrel.idPalindrome(2));
				assertEquals(true , Lycrel.idPalindrome(11));
				assertEquals(true , Lycrel.idPalindrome(121));
				assertEquals(true , Lycrel.idPalindrome(112));
	} 
}
