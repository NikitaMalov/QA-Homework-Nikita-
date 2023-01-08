package homeWork;

import org.openqa.selenium.By;

public class AdvancedAndOptional2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] ar = {   { 20, 18, 22, 20, 16 },
                { 18, 20, 18, 21, 20 },
                { 16, 18, 16, 20, 24 },
                {  25, 24, 22, 24, 25 }
            };

		//int F = ar [1] [1];
		//System.out.println("First value of the Array is ==> " + F);
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=4;j++) {
			int F = ar [i] [j];
		System.out.println( + F); 
	}

}}
}