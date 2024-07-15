package org.strings;

public class Strings_Litrl_Nnlitrl {
	
	public static void main(String[] args) {
		
	// Literal strings same strings will b allocated to same mmry
		
		System.out.println("Literal Strings:");
		
		String s1 = "java";
		System.out.println(System.identityHashCode(s1));
		
		String s2 = "Programming";
		System.out.println(System.identityHashCode(s2));
		
		String s3 = "java";
		System.out.println(System.identityHashCode(s3));
		
		
	// Non-Literal strings same strings will b allocated to diff mmry
		
		System.out.println("\nNon-Literal Strings:");
				
		String a1 = new String("Git");
		System.out.println(System.identityHashCode(a1));
				
		String a2 = new String("Jenkins");
		System.out.println(System.identityHashCode(a2));
				
		String a3 = new String("Git");
		System.out.println(System.identityHashCode(a3));
		
		
	}

}
