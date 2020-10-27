package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotationTest2 {

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

}
