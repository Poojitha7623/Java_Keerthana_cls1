package org.strings;

public class Strng_Splitmthd {
	 public static void main(String[] args) {
		
		 
String s = "ABCD#1234";

String substring = s.substring(5);
System.out.println("\nsubstring:\n"+substring);
		 
		 
		 String s1 = "ABCD#1234";
		 
		 System.out.println("\nsplit:");
		 
		 String[] split = s1.split("#");
	    System.out.println(split[1]);
	     
	    System.out.println("\nFor loop:");
	     for(int i = 0;i < split.length; i++) {
	     System.out.println(split[i]);
	     
		}
	 
	 
	 
	 
	 }

}
