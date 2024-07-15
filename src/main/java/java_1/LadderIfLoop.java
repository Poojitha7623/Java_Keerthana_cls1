package java_1;

public class LadderIfLoop {
	
public static void main(String[] args) {
		
		int rank = 17;
		
		if (rank <= 5) {
			System.out.println("Eligible for Scholarship");
			
		}
		else if (rank  <= 15) {
			System.out.println("Eligible for partial Scholarship");
			
		}
		else if (rank <= 25) {
			System.out.println("Eligible for Paritial Term Payments");
			
		}
		else if (rank <= 40) {
			System.out.println("Not Eligible for Scholarship");
	
		}
		
		else {
			
			System.out.println("No Seat in Institute");

		}
	}

}

