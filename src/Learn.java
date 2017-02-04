



public class Learn {


public static void main (String args[]){

	System.out.println("Hello");
	
	Learn learn = new Learn();
	
	Board HexBoard = learn.new Board();
	
	
	
	
}

class Board {
	
	int rows ;
	int width ;
 	Board getBoard(int pWidth, int pRows ){
 		
 		this.rows = pRows;
		this.width = pWidth;
 		
		return this;	
	}
 	
 	
 
}


class Node{
	int x ;
	int y ; 

    Node getPosition(int pX , int pY){
		this.x = pX;
		this.y = pY;
    	return this;  
	}
	
}


}
