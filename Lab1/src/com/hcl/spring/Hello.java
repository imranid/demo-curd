package com.hcl.spring;

public class Hello{
	private A aobj;
	
	private B bobj;
	
	public void setA(A aobj){
		System.out.println("SetA() is calling");
		this.aobj=aobj;	
	}
	
	public Hello(B bobj){
		System.out.println("Hello(one argumant is calling)");
		this.bobj=bobj;
		
	}
	
	
	public void show(){
		System.out.println("show in Hello");
		aobj.showA();
		bobj.showB();
	}

}
