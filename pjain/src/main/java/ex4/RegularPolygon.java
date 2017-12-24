package ex4;

public interface RegularPolygon {

	int getNumSides();

	int getSideLength();
	
	
	static int totalSides(RegularPolygon[] rp) {
		int total = 0;
		for (RegularPolygon p : rp) {
			total += p.getNumSides();
		}
		return total;
	}
	
	
	default int getPerimeter() {
		return getNumSides() * getSideLength();
	}

	default double getInterior() {
		return (getNumSides() - 2) * Math.PI /getNumSides();
	}
}
