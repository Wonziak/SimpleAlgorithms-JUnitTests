package Wonziak.TestSuite;
import Wonziak.Test.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Test Suite")
@SelectClasses({TargTest.class,
        SubStTest.class,
        SortsTests.class,
        SolutionTest.class,
        MatrixTest.class,
        MatrixIteratorTest.class})
public class TestSuite {
}
