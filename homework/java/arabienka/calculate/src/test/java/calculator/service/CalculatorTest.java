package calculator.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void positiveNumbersAdditionTest() {
        int expected = 11;
        Calculator calculator = new Calculator();
        int actual = calculator.addition(5, 6);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void negativeNumberAdditionTest() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.addition(5, -3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void positiveNumbersSubtractionTest() {
        int expected = -1;
        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(5, 6);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void division() {
        Double expected =6.0;
        Calculator calculator=new Calculator();
        Double actual=calculator.division(30,5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void multiply() {
        int expected=45;
        Calculator calculator=new Calculator();
        int actual=calculator.multiply(5,9);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addition() {
        int expected=14;
        Calculator calculator=new Calculator();
        int actual=calculator.addition(5,9);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtraction() {
        int expected=50;
        Calculator calculator=new Calculator();
        int actual=calculator.subtraction(90,40);
        Assert.assertEquals(expected,actual);
    }

}