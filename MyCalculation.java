package inheritance;

public class MyCalculation extends Calculation {

	public void Multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers: " +z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 20, b = 10;
	MyCalculation demo = new MyCalculation();
	demo.Addition(a, b);
	demo.Subtraction(a, b);
	demo.Multiplication(a, b);
	demo.Devision(a, b);
	
		
	}

}
