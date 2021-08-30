package com.crm.qa.testcases;

public class TestTwo {

	public static void main(String[] args) {
		
		
		String Arr[];
		String str="My name is Devkant";
		Arr=str.split(" ");
		String y = "";
		for(String a:Arr) {
			
			StringBuffer stuf=new StringBuffer(a);
			y=y +" "+ stuf.reverse();
				
			
			
		}
		System.out.println(y);
	}

}
