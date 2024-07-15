package org.cls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections_2 {
	
	public static void main(String[] args) {
		
		
// Arraylist li = new Anyone(Array/linked/Vector)();		
		
       List li = new ArrayList();
		
		li.add(10);  //indx 0
		li.add("string"); //indx 1
		li.add(true);  //indx 2
		li.add(567.74356f); //indx 3
		li.add(null); //indx 4
		li.add(10); //indx 5
		
		System.out.println("\nvalues in list:\n"+li);
		
       List li1 = new LinkedList();
		
		li1.add(null);  //indx 0
		li1.add("string"); //indx 1
		li1.add(true);  //indx 2
		li1.add("Java"); //indx 3
		li1.add(234.67f); //indx 4
		li1.add(null); //indx 5
		li1.add(10); //indx 6
		
		System.out.println("\nvalues in list:\n"+li1);
		
//To cpy values from 1 interfc to other  (will not use returntype)
		
//		boolean addAll = li1.addAll(li);
//		System.out.println("\nAdding list:\n"+addAll);
		
//		li1.addAll(li);
//		System.out.println("\nAdding list:\n"+li1);
//		
//		// to print the same values present in both interfaces
//		
		li.retainAll(li1);
		System.out.println("\nRetaining list:\n"+li);
//		
//		// to remove the common value from both interface
//		
//		li1.removeAll(li);
//		System.out.println("\nRemoving the list:\n"+li1);
		
//		
//		// to know the equality of the 2 interfaces -- returntype is boolean
//		
//		boolean equals = li.equals(li1);
//		System.out.println("\nEqual values in list:\n"+equals);
//		
		
		

//  to get the values equality true, the index also should match
		// along with values
		
//       List li = new ArrayList();
//		
//       li.add(null); //indx 4
//		li.add("string"); //indx 1
//		li.add(true);  //indx 2
//		
//		
//		System.out.println("\nvalues in list:\n"+li);
//		
//       List li1 = new ArrayList();
//		
//		li1.add(null);  //indx 0
//		li1.add("string"); //indx 1
//		li1.add(true);  //indx 2
//		
//		
//		System.out.println("\nvalues in list:\n"+li1);
//
//	// to know if the values in list equality -- returntype is boolean
//		
//		boolean equals = li.equals(li1);
//		System.out.println("\nEqual values in list:\n"+equals);
//		
		
		
	}

}
