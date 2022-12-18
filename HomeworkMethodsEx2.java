package homeWork;

public class HomeworkMethodsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {"John", "Mary"};
	
		
		Print_Array(name);
		
	}
		public static void Print_Array(String []array) {
		for(int i = 0;i<=array.length-1;i++) {
		System.out.println("Hello, " + array[i]);
			}
	}

}
