import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**

 * 
 */

/**
 * @author dnegi3
 *
 */
public class Path {

double distance(Point firstPoint,Point secondPoint){
	
	DecimalFormat df=new DecimalFormat("0.000000");
	double d = Math.sqrt( Math.pow((firstPoint.x - secondPoint.x),2) + Math.pow((firstPoint.y - secondPoint.y),2));
	double finalValue = 0;
	String formate = df.format(d); 
	try {
		finalValue = (Double)df.parse(formate) ;
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	return finalValue;
	
}


public static void main(String[] args) {
	     System.out.println("Input ");
         Scanner sc = new Scanner(new BufferedInputStream(System.in));
         int number = sc.nextInt();
         if (number <3) {
        	 System.out.println("The number of verticess atleast 3");
        	 return ;
         }
          
         List<Point> verteces = new ArrayList<Point>();
         int numVer = 0 ; 
         int minX = 0 , maxX=0, minY = 0 ,maxY=0;
         Point minPointX = null ,maxPointX = null,minPointY = null,maxPointY = null;
         
         while(sc.hasNext()){
        	  numVer++;
        	  System.out.println("X Vertces"); 
        	  int x1 = sc.nextInt();
        	  
        	  System.out.println("y Vertces");
        	  int y1 = sc.nextInt();
        	  Point p1 = new Point(x1,y1);
        	 
        	  if(x1 <= minX)
        	  {
        		  minX = x1; 
        		  minPointX = p1;  
        	  }
        	  
        	  if(y1 <= minY)
        	  {
        		  minY = y1;
        		  minPointY = p1; 
        	  }
        	
        	  if(x1 >= maxX)
        	  {
        		  maxX = x1;
        		  maxPointX =p1;
        	  }
        	  if(y1 >= maxY)
        	  {
        		  maxY = y1;
        		  maxPointY =p1;
        	  }
        	  
        	  
        	  System.out.println(p1);
        	  verteces.add(p1);
        	 
        	  if(numVer >= number){
        		  break;
        	  }
        	  
        	  
         }
         
         System.out.println(verteces );
         
         System.out.println( "Max Point X , Y  " + maxPointX  + " , " + maxPointY);
         System.out.println( "Min Point X , Y  " + minPointX  + " , " + minPointY);
         System.out.println( "Max X , Min X " + maxX  + " , " + minX);
         System.out.println( "Max Y, Min Y" + maxY  + " , " + minY);
         
         findLongestDistance(verteces,maxPointX,maxPointY,maxX,maxY,minPointX,minPointY,minX,minY);

}


/**
 * @param vereces
 * @param minY 
 * @param minX 
 * @param minPointY 
 * @param minPointX 
 * @param maxY 
 * @param maxX 
 * @param maxPointY 
 * @param maxPointX 
 */
private static void findLongestDistance(List<Point> vereces, Point maxPointX, Point maxPointY, int maxX, int maxY, Point minPointX, Point minPointY, int minX, int minY) {
	
	
	
}

}


class Point{
   int x; 
   int y;
   
   Point(int x , int y){
	   this.x = x ;
	   this.y=y;
   }
   
   /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "X:"+ this.x + "  Y:" + this.y;
	}
}



