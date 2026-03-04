package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTgTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneDoubleNumberTan(double num){
        assertEquals(Math.tan(num),calculator.tg(num),0.0001,"incorrect tan result");
    }
}
