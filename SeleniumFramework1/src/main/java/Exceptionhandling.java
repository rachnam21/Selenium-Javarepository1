
public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception
	{
		System.out.println("Heloo I m here");
		int i = 1/0;
		System.out.println("Completed");
	}
}
	
		