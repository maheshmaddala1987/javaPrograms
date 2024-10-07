package multiple.inheritance.java;

public class Child implements Father,Mother{
	
	public void height() {
		System.out.println("child hight is good");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ch = new Child();
		ch.height();
	}

	

}
