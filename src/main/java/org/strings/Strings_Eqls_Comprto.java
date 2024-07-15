package org.strings;

public class Strings_Eqls_Comprto {
	public static void main(String[] args) {
		
		
		// ASCII -- A-Z = 65to90.., a-z = 97to122
		//space=32, 0to9 = 48to57..,
		// s1 = s2 , a-A = 97 - 65 =32
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		//String s2 = "JA";  -- -ve of compareto
		//String s2 = "JAVa"; -- -ve of ignorecase
		//String s2 = "JAVAP"; -- -- -ve of equals
		
		// to find the equality of 2 strings 
		
		boolean equals = s1.equals(s2);
		System.out.println("\nequals:\n"+equals);
		
		// to find the equality of 2 strings with ignoring the case of char
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println("\nequalsIgnoreCase:\n"+equalsIgnoreCase);
		
		// to join the 2 strings by concating
		
		String concat = s1.concat(s2);
		System.out.println("\nconcat:\n"+concat);
		
		//  to compare the missing letters in 2 strings 
		
		int compareTo = s1.compareTo(s2);
		System.out.println("\ncompareTo:\n"+compareTo);
		
		// to compare the missing letters in 2 strings while ignoring the case of char
		
		int compareToIgnoreCase = s1.compareToIgnoreCase(s2);
		System.out.println("\ncompareToIgnoreCase:\n"+compareToIgnoreCase);;
		
		
	}

}
