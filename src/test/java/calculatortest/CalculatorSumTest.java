package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorSumTest extends BaseTest {

    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoLongNumbersAddition(long num1, long num2){
        assertEquals(Math.addExact(num1,num2),calculator.sum(num1,num2),"incorrect result of addition");
    }
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoDoubleNumbersAddition(double num1, double num2){
        assertEquals(num1+num2,calculator.sum(num1,num2),0.0001,"incorrect result of addition");
    }
}
