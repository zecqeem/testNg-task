package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorIsPositiveTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void onePositiveLongNumber(long num1){
        assertTrue(calculator.isPositive(num1),"incorrect result of isPositive");
    }
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneNegativeLongNumber(long num1){
        assertFalse(calculator.isPositive(num1),"incorrect result of isPositive");
    }
    @Test(groups = {"positive"})
    public void testIsPositiveWithZero(){
        assertFalse(calculator.isPositive(0L),"incorrect result of isPositive");
    }
}
