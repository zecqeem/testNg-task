package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorIsNegativeTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void onePositiveLongNumber(long num1){
        assertFalse(calculator.isNegative(num1),"incorrect result of isNegative");
    }
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneNegativeLongNumber(long num1){
        assertTrue(calculator.isNegative(num1),"incorrect result of isNegative");
    }
    @Test(groups = {"positive"})
    public void testIsNegativeWithZero(){
        assertFalse(calculator.isNegative(0L),"incorrect result of isNegative");
    }
}
