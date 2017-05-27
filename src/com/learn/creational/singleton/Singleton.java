package com.learn.creational.singleton;

/**
 * 
 	Abstract Factory and Factory Methods implemented as singletons.

	There are certain situations when the a factory should be unique. Having 2 factories might have undesired effects when objects are created. 
	To ensure that a factory is unique it should be implemented as a singleton. By doing so we also avoid to instantiate the class before using it.
	Hot Spot:
		Multithreading - A special care should be taken when singleton has to be used in a multithreading application.
		Serialization - When Singletons are implementing Serializable interface they have to implement readResolve method in order to avoid having
		 2 different objects.
		Classloaders - If the Singleton class is loaded by 2 different class loaders we'll have 2 different classes, one for each class loader.
		Global Access Point represented by the class name - The singleton instance is obtained using the class name.
		 At the first view this is an easy way to access it, but it is not very flexible. If we need to replace the Sigleton class,
		 all the references in the code should be changed accordinglly.
 */
public class Singleton {

	private static Singleton  single= new Singleton();
	
	/**
	 * 
	 */
	private String mName ;
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return mName;
	}


	public void setName(String mName) {
		this.mName = mName;
	}


	public String toString(){
		
		return super.toString()  + " --------------" + this.mName; 
		

	}
	
	private Singleton(){
		
		
	}
		
//
//	public static synchronized Singleton getSingleton(){
//Constly Synchronized even if the instance is already created.	
public static synchronized Singleton getSingleton(){
			
		if (single == null ){
			
			
			synchronized(Singleton.class)
			{
				single = new Singleton();
			}
		}
		
		
		return single;
		
	}
}

