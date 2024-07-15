package org.strings;

public class Strng_chrat_trimto {
	
	public static void main(String[] args) {
		
	
	String s = "Java Programming Class      a       ";
	
	// to fetch the char by passing index of letter in sequence
	 
	char charAt = s.charAt(3);
	 
	 //System.out.println(charAt);
	 
	System.out.println("\ncharAt:\n"+charAt);
	 
	// to find the index position by passing char 
	
	int indexOf = s.indexOf('v');
	System.out.println("\nindexOf:\n"+indexOf);
	 
	// to fetch the last index pos of a letter 
	
	int lastIndexOf = s.lastIndexOf('s');
	System.out.println("\nlastIndexOf:\n"+lastIndexOf);
	
	// to replace a letter
	//String replace = s.replace('J', '3');
	
	String replace = s.replace('m', '*');
	System.out.println("\nreplace:\n"+replace);
	
	//to replace a letter with sequence
	//String replaceAll = s.replaceAll("v", "123");
	
	String replaceAll = s.replaceAll("Java", "python");
	System.out.println("\nreplaceAll:\n"+replaceAll);
	
	// to find if string is empty or not
	// String s = "";
	
	boolean empty = s.isEmpty();
	System.out.println("\nempty:\n"+empty);
	
	//to remove any unwanted spaces
	
	String trim = s.trim();
	System.out.println("\ntrim:\n"+trim);
		 
	}

}

