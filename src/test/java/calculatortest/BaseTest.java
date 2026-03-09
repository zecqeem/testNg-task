package calculatortest;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {
    protected Calculator calculator;
    @BeforeClass(alwaysRun = true)
    public void logTestStart() {
        calculator = new Calculator();
    }
    @BeforeMethod(alwaysRun = true)
    public void methodTestStart(Method method) {
        System.out.println("Starting test: " + method.getName());
    }
    @AfterSuite(alwaysRun = true)
    public void globalTearDown() {
        System.out.println("shutdown");
    }
}
