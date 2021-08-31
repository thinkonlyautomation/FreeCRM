package com.crm.qa.testcases;

import java.util.ArrayList;

public class Temp1 {

	public static void main(String[] args) {

		ArrayList<String> strArr= new ArrayList<String>();
		
		strArr.add("2.1.2 asdadsad");
		strArr.add("2.1.1 ABCDEF 2");
		strArr.add("2.1.11 KGHJ");
		
		String C="2.1.1";
		
		for(String a: strArr) {
			
			String ab[];
			
			ab=a.split(" ");
			System.out.println(ab[0]);
			if(ab[0].equals(C)){
				
				
				System.out.println("Yes");
						
				
			}else {
				
				System.out.println("No");
				
			}
			
			
		}
		
		
		

	}

}
