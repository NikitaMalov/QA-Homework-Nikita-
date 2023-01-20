package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersHW
{

    @Test
    @Parameters ({"val1", "val2"})
        public void div(int v1, int v2) {
    	if(v2==0) {
    	System.out.println("Division by 0 is not allowed");
    	}else{
    	int quot = v1/v2;
        System.out.println("The Quotient Of Value 1 and 2 is " + quot);
    }

}

}