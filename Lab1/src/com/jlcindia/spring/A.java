package com.jlcindia.spring;

public class A {

	private int a;          //S.I
	
	 private String msg;    //S.I
	
	public A(){
		System.out.println("A()-DC");
	}
	public  void setInt(int a){
		this.a=a;			
	}
	public void setMsg(String msg){
		this.msg=msg;
	}
	public void showA(){
		System.out.println("showA()");
		System.out.println(a);
		System.out.println(msg);
	}
}
