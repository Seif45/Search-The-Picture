package eg.edu.alexu.csd.datastructure.iceHockey.cs34;

public class Element {
	
	int x , y , x1 , x2 , y1 , y2 , counter ;
	boolean up , down , left , right ;
	
	public Element (int xCoordinate , int yCoordinate , int leastX , int largestX , int leastY , int largestY , int number , boolean u , boolean d , boolean l , boolean r) {
		x = xCoordinate;
		y = yCoordinate;
		x1 = leastX;
		x2 = largestX;
		y1 = leastY;
		y2 = largestY;
		counter = number;
		up = u;
		down = d;
		left = l;
		right = r;
	}
}
