package com.hcl.spring;

public class A {

	private int a;
	
	 private String msg;
	
	public A(){
		System.out.println("A()-DC");
	}
	public void setInt(int a){
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
