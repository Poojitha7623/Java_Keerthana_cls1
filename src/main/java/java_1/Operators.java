package java_1;

public class Operators {
	
public static void main(String[] args) {
		
		int rank = 4;
		
//		if (rank <= 5 && rank  <= 15 && rank <= 40) {
		
//			System.out.println("Eligible for Scholarship");
//			
//		}`	
//		
//		if (rank  <= 15 || rank <= 25 || rank <= 40) {
		
//			System.out.println("Eligible for partial Scholarship");
//		}
//		
		
		if (rank <= 5 || rank  <= 15 && rank <= 40) {
			
			System.out.println("Not Eligible for Scholarship");
		}
		
		else {
			
			System.out.println("No Seat in Institute");

		}
	}



}
