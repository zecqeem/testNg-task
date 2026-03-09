package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorDivTest extends BaseTest{
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoLongNumbersDivision(long num1, long num2){
        assertEquals(Math.divideExact(num1,num2),calculator.div(num1,num2),"incorrect result of division");
    }
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoDoubleNumbersDivision(double num1, double num2){
        assertEquals(num1/num2,calculator.div(num1,num2),0.0001,"incorrect result of division");
    }
    //what exception should i wait here
    @Test(groups = {"negative"}, expectedExceptions = NumberFormatException.class)
    public void cannotDivideByZeroLong() {
        calculator.div(10L,0L);
    }

    @Test(groups = {"negative"})
    public void cannotDivideByZeroDouble() {
        assertEquals(calculator.div(10.0,0.0), Double.POSITIVE_INFINITY,"division vy zero should return infinty");
    }

}
