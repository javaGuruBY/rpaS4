package circle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

public class CircleTest {
    Circle circle;

    @Before
    public void setCircle() {
        this.circle = new Circle();
    }

    @Test
    public void calculateArea_positive() {
        circle.setRadius(1);
        Assert.assertEquals(Math.PI, circle.calculateArea(), 0);
    }

    @Test
    public void calculateArea_negative() {
        circle.setRadius(-1);
        Assert.assertEquals(0.0, circle.calculateArea(), 0);
    }

    @Test
    public void calculateArea_infinity() {
        circle.setRadius(Double.POSITIVE_INFINITY);
        Assert.assertEquals(0.0, circle.calculateArea(), 0);
    }
}