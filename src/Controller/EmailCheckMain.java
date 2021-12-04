package Controller;



public class EmailCheckMain {
	
	

	public static void main(String[] args) 
	{
		EmailChecker ec= new EmailChecker();

		 try 
		 {
			 ec.change();
			// ec.checkEmail("onlin@aol.com");
		     //ec.suggest("lama");
		 } 




		catch (Exception e) {
		 
		 e.printStackTrace();
		}

	}

}
