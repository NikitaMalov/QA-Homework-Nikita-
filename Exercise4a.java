package homeWork;

public class Exercise4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MyUserId = "nik";
		String MyPassword = "abc123";
	boolean i = Autorization("nik", "abc123", MyUserId, MyPassword);
				
		if(i==true) System.out.println("authentication passed");
    else System.out.println("authentication failed");
	}	
				
	public static boolean Autorization(String userid, String password, String a, String b) {
		 if(userid.equals(a) && password.equals(b))
		 return true;
		 else return false;
		  		 		    			  
			    }
		
	}


