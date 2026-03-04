package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultTest extends BaseTest{
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoLongNumbersMultiplication(long num1, long num2){
        assertEquals(Math.multiplyExact(num1,num2),calculator.mult(num1,num2), "incorrect result of Multiplication");
    }
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoDoubleNumbersMultiplication(double num1, double num2){
        assertEquals(num1*num2,calculator.mult(num1,num2),0.0001,"incorrect result of Multiplication");
    }
}
