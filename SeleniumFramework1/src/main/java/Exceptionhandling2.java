
public class Exceptionhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("Heloo I m here");
			int i = 1/0;
			System.out.println("Completed");
		}
		catch(Exception e){
			System.out.println("Inside catch blck");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			
		}
		
		finally{
			System.out.println("inside finally block");
		}
		
		
	}

}
