package calculatortest;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CalculatorSubTest extends BaseTest {

    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoLongNumbersSubtraction(long num1, long num2){
        assertEquals(Math.subtractExact(num1,num2),calculator.sub(num1,num2),"incorrect result of subtraction");
    }
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoDoubleNumbersSubtraction(double num1, double num2){
        assertEquals(num1-num2,calculator.sub(num1,num2),0.0001,"incorrect result of Subtraction");
    }
}
