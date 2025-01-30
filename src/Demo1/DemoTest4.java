package Demo1;

public class DemoTest4 {
	public static void main(String[] args) {
		System.out.println("ZAID & SALLY LIVE IN TAMPA");
		
		int Sally = 31; 
		int Zaid = 36; 
		
		int result = Zaid + Sally; 
		
		DemoTest4 b = new DemoTest4 (); 
		b.add("Zaid", 36);
		
		
	}
	
	public void add (String name, int a) { 
		System.out.println(name + a);
	}
}
