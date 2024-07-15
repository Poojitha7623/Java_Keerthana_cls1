package org.cls;

public class Arrays {
	
	public static void main(String[] args) {
		
		//datatype[] var = new datatype[10];
		//datatype var[] = new datatype[size];
	
		
	// --------for string in array	
		// 						0        1	
//		// -- String[] name = {"java", "selenium"};
//		
//		String[] name = {"java", "selenium"};
//		
	// -- for loop 
		// System.out.println("For loop:");
//		for (int i=0; i<name. length; i++)
//		{
//		System. out. println(name[i]);
//		}
//		
//	// -- enhanced for loop	
		//System.out.println("\nEnhanced For loop:");
		
//		for (String string : name) {
//			
//			System. out. println(string);
//		}
//		
		int a[] = new int[5];//
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 10; //--duplicats can b alocatd as it has diff indexs
		
		//System.out.println(a); -- only adrss of the index will b printed
		
//		//System.out.println(a[0]);  -- to print each index it will take n num of lines
//		System.out.println(a[1]);
		
		// -- we use for loop if we know the exact index
		System.out.println("For loop:");
		
		// we knw the limit/cond..
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
			
		
	// --we use enhanced for loop .. no limit/cond based on values not indx
		
		System.out.println("\nEnhanced For loop:");
		//        10,20,30,40,10
		//			 |	
		
	
		for (int i : a) {
			
			System.out.println(i);
			
		}
		
	}

}
