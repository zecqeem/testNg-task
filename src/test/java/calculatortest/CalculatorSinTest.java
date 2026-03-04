package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSinTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneDoubleNumberSin(double num){
        assertEquals(Math.sin(num),calculator.sin(num),0.0001,"incorrect sin result");
    }
}
