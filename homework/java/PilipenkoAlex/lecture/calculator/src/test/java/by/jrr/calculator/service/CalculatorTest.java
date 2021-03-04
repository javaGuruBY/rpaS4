package by.jrr.calculator.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addition() {
    }

    @Test
    public void subtraction() {
    }
    @Test
    public void positiveNumbersAdditionTest(){
        Calculator calculator = new Calculator();
        int expected = 9;
        int actual = calculator.addition(4, 5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void negativeNumbersAdditionTest(){
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.addition(11, -5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void positiveNumbersSubtractionTest(){
        Calculator calculator = new Calculator();
        int expected = 1;
        int actual = calculator.subtraction(4, 3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void negativeNumbersSubtractionTest(){
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.subtraction(11, 5);
        Assert.assertEquals(expected, actual);
    }
}