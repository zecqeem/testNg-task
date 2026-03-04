package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorCtgTest extends BaseTest{
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneDoubleNumberCtg(double num){
        assertEquals(1.0 / Math.tan(num),calculator.ctg(num),0.0001,"incorrect ctg result");
    }
}
