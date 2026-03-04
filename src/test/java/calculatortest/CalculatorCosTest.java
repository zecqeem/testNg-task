package calculatortest;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorCosTest extends BaseTest {
    @Test(groups = {"positive"}, dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void oneDoubleNumberCos(double num){
        assertEquals(Math.cos(num),calculator.cos(num),0.0001,"incorrect cos result");
    }
}
