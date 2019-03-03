interface A {
	
	public default String getName(){
		return "A";
	}
}

interface B {
	
	public default String getName(){
		return "B";
	}
}


public class Test8 implements A, B  {
	
	public static void main(String[] args) {	
		
		Test8 t1 = new Test8();
		t1.getName();
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return B.super.getName();
	}
	
	public String methodV1(){
		return "";
	}

	}
