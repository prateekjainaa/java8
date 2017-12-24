package ex4;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

	@Test
	public void testPerimeter() {
		RegularPolygon s = new Square(4);
		
		Assert.assertEquals(16, s.getPerimeter());
		
	}
	
	@Test
	public void testAngle() {
		RegularPolygon s = new Square(4);
		System.out.println(s.getInterior());
		Assert.assertTrue(Math.abs(s.getInterior() - (Math.PI/2)) == 0.0d); 
		
	}
	
}
