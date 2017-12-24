package ex4;

public class Square implements RegularPolygon {
	
	private int len;
	
	public Square(int length) {
		this.len = length;
	}

	/* (non-Javadoc)
	 * @see ex4.RegularPolygon#getNumSides()
	 */
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	/* (non-Javadoc)
	 * @see ex4.RegularPolygon#getSideLength()
	 */
	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return this.len;
	}

	
	
}
