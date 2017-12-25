package com.app.single;

public class SingletonPatternDemo {
	
	private static SingletonPatternDemo instance = new SingletonPatternDemo();
	
	private SingletonPatternDemo(){
		System.out.println("Constructor calling");
	}
	
	public static SingletonPatternDemo getObject(){
		//System.out.println(instance);
		if(instance==null){
			System.out.println("object intialized");
		}
	  return instance;	
	}
    public static void main(String[] args) {
    	System.out.println(instance);
		SingletonPatternDemo d1 = SingletonPatternDemo.getObject();
		SingletonPatternDemo d2 = SingletonPatternDemo.getObject();
	    System.out.println((d1==d2)+":"+d1.hashCode()+":"+d2.hashCode());
	}
}
