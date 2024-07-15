package org.strings;

public class Strng_uprtosubstrng {
	
public static void main(String[] args) {
		
		// to find length of string
		
		String s= "Programming with Java";		
		System.out.println("length: \n" +s.length());
			
		//  --  to know the string 
		//to convert  the string to uppercase
		
		String upperCase = s.toUpperCase();
		System.out.println("\nupperCase:\n"+upperCase);
		
		//to convert  the string to lowercase
		
			String lowerCase = s.toLowerCase();
			System.out.println("\nlowerCase:\n"+lowerCase);
			
		//to know the starting word  -- its is done with boolean
			
			boolean startswith = s.startsWith("Programming");
			System.out.println("\nstartswith:\n"+startswith);
			
		//to know the ending word  -- its is done with boolean
			
			boolean endswith = s.endsWith("Java");
			System.out.println("\nendswith:\n"+endswith);
			
		//to know the contains in sequence  -- its is done with boolean
			
			boolean contains = s.contains("Java");
			System.out.println("\ncontains:\n"+contains);
			
		//to print the specific string in the sequence
			
			String substring = s.substring(12);
			//System.out.println(""+substring);
			System.out.println("\nsubstring:\n"+substring);
		
			String substring1 = s.substring(0);
			System.out.println("\nsubstring1:\n"+substring1);
			
			String substring2 = s.substring(0, 7);
			System.out.println("\nsubstring2:\n"+substring2);
			
		
	}
}
