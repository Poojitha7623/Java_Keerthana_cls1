package java_1;

public class Child implements Parent_1,Parent_2{

	public void part3() {
		// TODO Auto-generated method stub
		System.out.println("33");
		
	}

	public void part4() {
		// TODO Auto-generated method stub
		System.out.println("44");
		
	}

	public void part1() {
		// TODO Auto-generated method stub
		System.out.println("11");
		
	}

	public void part2() {
		// TODO Auto-generated method stub
		System.out.println("22");
		
	}

	public static void main(String[] args) {		
		Child c = new Child();
		c.part1();
		c.part2();
		c.part3();
		c.part4();		
	}


}