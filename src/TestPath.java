/**
 * 
 */

/**
 * @author dnegi3
 *
 */
public class TestPath {
	
	public boolean distanceTest(){
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(10, 10);
		Point p3 = new Point(5, 5);
		
		Path path = new Path();
		double d = path.distance(p2, p1);
		
		double d2 = path.distance(p3, p1);
		
		double d3 = path.distance(p2, p3);
		
		System.out.println("d1 " + d + "  d2 " + d2 + " d3 " + d3);
		if ((d == 14.142136) && (d2==7.071068) && (d3 == 7.071068)){
			return true;
		} else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		TestPath  t1 = new  TestPath();
		System.out.println("Test distance" + t1.distanceTest() 
		);
	}

}