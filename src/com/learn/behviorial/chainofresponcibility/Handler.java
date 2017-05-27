package com.learn.behviorial.chainofresponcibility;

public abstract class Handler
{
	protected Handler mSuccessor;
	public void setSuccessor(Handler successor)
	{
		mSuccessor = successor;
	}

	public  void handleRequest(Request request){
			
		System.out.println("Default handling ");
	}
}