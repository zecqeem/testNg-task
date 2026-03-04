package calculatortest;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {
    protected Calculator calculator;
    @BeforeMethod(alwaysRun = true)
    public void logTestStart(Method method) {
        calculator = new Calculator();
        System.out.println("Starting test: " + method.getName());
    }

    @AfterSuite(alwaysRun = true)
    public void globalTearDown() {
        System.out.println("shutdown");
    }
}
