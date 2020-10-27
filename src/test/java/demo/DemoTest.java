package demo;

import org.testng.annotations.Test;

public class DemoTest {
    public static void main(String[] args) {
        System.out.println("Hello TestNG !");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }
}
