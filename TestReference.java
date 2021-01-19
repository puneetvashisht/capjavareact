class User{
	String name;
}


public class TestReference {
	
	//static variable
	static int count = 34;
	
	// instance variable
	 int y = 44;
	 // instance method
	 public void m2() {
		 
	 }
	//static method
	public static void m1() {
		int x = 23;
		
		TestReference t = new TestReference();
		System.out.println(t.y);
	}

	public static void main(String[] args) {
		// Reference variables
		String s = new String("India123");
		User u = new User();
		TestReference t = new TestReference();
		System.out.println(t.y);
		
		// Primitive
		int x = 34;
		
		System.out.println(s);

	}

}
