package inheritance;

public class MyNewCalculation extends MyCalculation {
		
	public void Division(int x, int y) {
	z = x / y;
	System.out.println("The quotient of the given numbers: " +z);
	} 
	
	public static void main(String[] args) {
	int a = 20, b = 10;
	MyNewCalculation demo = new MyNewCalculation();
	demo.Addition(a, b);
	demo.Subtraction(a, b);
	demo.Multiplication(a, b);
    demo.Division(a, b);
	
	}
	}

