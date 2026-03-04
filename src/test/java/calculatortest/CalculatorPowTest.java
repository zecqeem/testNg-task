package calculatortest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalculatorPowTest extends BaseTest{
    @Test(groups = {"positive"},dataProvider = "dataFromCsv", dataProviderClass = CsvDataProviderUtil.class)
    public void twoDoubleNumbersPower(double num1, double num2){
        assertEquals(Math.pow(num1,num2),calculator.pow(num1,num2),0.0001,"incorrect result of Power");
    }
    @Test(groups = {"negative"})
    public void cannotHaveComplexNums(){
        assertTrue(Double.isNaN(calculator.pow(-1.0,-0.5)),"should be Not A Number");
    }
}
