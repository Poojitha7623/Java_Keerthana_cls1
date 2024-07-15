package java_1;

public class NestedIfLoop {
	
	public static void main(String[] args) {
		
		int Age = 29;
		
		if (Age == 20 ) {
			
			System.out.println("Eligible");
			
			if (Age >= 28) {
				
				System.out.println("Eligible for vote");
				
			}
		}
		else {
			System.out.println("Not Eligible");
		}
			
}

}
