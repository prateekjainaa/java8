/**
 * 
 */
package ex4;

/**
 * @author ejaprja
 *
 */
public class EquilateralTriangle implements RegularPolygon {
	
	private int sideLength;
	
	public EquilateralTriangle(int side) {
		this.sideLength = side;
	}

	/* (non-Javadoc)
	 * @see ex4.RegularPolygon#getNumSides()
	 */
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	/* (non-Javadoc)
	 * @see ex4.RegularPolygon#getSideLength()
	 */
	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return this.sideLength;
	}

}
