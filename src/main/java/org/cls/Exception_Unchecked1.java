package org.cls;

import java.util.ArrayList;
import java.util.List;

public class Exception_Unchecked1 {
	
	public static void main(String[] args) {

		
//		
//		// Arithemetic Execption
//		
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3/0);
//		System.out.println(4);
//		System.out.println(5);
//		
//	
		
		
		
		
//		// IndexOutOfBound Exception
//			
//			List li = new ArrayList();
//			li.add(25);
//			li.add(15);
//			li.add(11);
//			
//			System.out.println(li.get(1));
//			System.out.println(li.get(3));
//			
//			
			
//			
//		// ArrayIndexOutOfBound Exception
//			
//			int a[] = new int[2];
//			
//			a[0]= 10;
//			a[1]= 20;
//			a[2]= 30;
//			a[3]= 40;
//			
		
//			//StringIndexOutOfBound Exception
//			
//				//		 0123
//			String s1 = "Java";
//			System.out.println(s1.charAt(2));
//			System.out.println(s1.charAt(7));
//			
//			
			
			
			
//			// NullPointer Exception
//			
//			String s1 = null;
//			System.out.println(s1.charAt(0));
//			
	
		
	//NumberFormat Exception
		
		//parse - methd to convrt strng num to integer -- clsnm.mthnm();
		
		System.out.println("\nPrint Number:");
		String s1 ="100";
		System.out.println(Integer.parseInt(s1));
		// "100" to 100
		
		// without parse we cant cnvrt strng to int and will b just added 
		
		System.out.println("\nPrint string added to number:");
		String s2 ="5";
		// 				5+10 = 510
		System.out.println(s2+10);
		
		System.out.println("\nPrint Number:");
		
		int parseInt = Integer.parseInt(s2);
		// 					5+20=25
		System.out.println(parseInt+20);
		
		
		// without parse we cant cnvrt strng to int and will b just added	
		
		System.out.println("\nPrint string added to number:");
		String s3 ="abc";
		// 				abc+10 = abc10
		System.out.println(s3+10);
		
		System.out.println("\nPrint Number:");
		// --- it cant convert the string to int so number frmt exception
		int parseInt1 = Integer.parseInt(s3);
		// 					5+20=25
		System.out.println(parseInt1+20);
		
		
		
		
		
		
		

		
	}

}
