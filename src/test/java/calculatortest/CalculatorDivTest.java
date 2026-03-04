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
    @Test(groups = {"negative"}, expectedExceptions = NumberFormatException.class)
    public void cannotDivideByZeroLong() {
        calculator.div(10L,0L);
    }
    //should throw exception because this is basic math logic?
    @Test(groups = {"negative"}, expectedExceptions = NumberFormatException.class)
    public void cannotDivideByZeroDouble() {
        calculator.div(10.0,0.0);
    }

}
