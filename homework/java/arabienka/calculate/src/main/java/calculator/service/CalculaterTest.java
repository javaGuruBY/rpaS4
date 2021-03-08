package calculator.service;

public class CalculaterTest {
    public static int testQuantity = 0;
    public static int testPassed = 0;
    public static int testFailed = 0;

    public void testRunner() {
        try {
            positiveNumbersSubtractionTest();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            testQuantity++;
        }

        try {
            positiveNumbersAdditionTest();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            testQuantity++;
        }

        try {
            negativeNumberAdditionTest();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            testQuantity++;
        }

        System.out.println("testQuantity = " + testQuantity);
        System.out.println("testPassed = " + testPassed);
        System.out.println("testFailed = " + testFailed);
    }

    public void positiveNumbersAdditionTest() throws Exception {
        int expected = 11;
        Calculator calculator = new Calculator();
        int actual = calculator.addition(5, 6);
        boolean isTestPussed = expected == actual;

        if (isTestPussed) {
            testPassed++;
        } else {
            testFailed++;
            throw new Exception("positiveNumbersAdditionTest = " + isTestPussed);
        }
    }


    public void negativeNumberAdditionTest() throws Exception {
        Calculator calculator = new Calculator();
        int expected =2;
        int actual = calculator.addition(5, -3);
        boolean isTestMissed = expected == actual;

        if (isTestMissed) {
            testPassed++;
        } else {
            testFailed++;
            throw new Exception("negativeNumberAdditionTest = " + isTestMissed);

        }
    }

    public void positiveNumbersSubtractionTest() throws Exception {
        int expected = -1;
        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(5, 6);
        boolean isTestPassed = expected == actual;

        if (isTestPassed) {
            testPassed++;
        } else {
            testFailed++;
            throw new Exception("positiveNumbersSubtractionTest = " + isTestPassed);
        }
    }
}
