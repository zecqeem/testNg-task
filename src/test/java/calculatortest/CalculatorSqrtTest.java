package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSqrtTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneDoubleNumberSquareRoot(double num1){
        assertEquals(Math.sqrt(num1),calculator.sqrt(num1),0.0001,"incorrect result of square root");
    }
}
