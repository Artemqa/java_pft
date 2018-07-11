package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p = new Point(1,3,2,4);
        Assert.assertEquals(p.distance(), 2.8284271247461903);
    }
}
