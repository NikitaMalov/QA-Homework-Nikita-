package homeWork;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean i = Autorization("nik", "abc123");
				
		if(i==true) System.out.println("authentication passed");
    else System.out.println("authentication failed");
	}	
				
	public static boolean Autorization(String userid, String password) {
		String MyUserId = "nik";
		String MyPassword = "abc123";
		 if(userid.equals(MyUserId) && password.equals(MyPassword))
		 return true;
		 else return false;
		  		 		    			  
			    }
		
	}


