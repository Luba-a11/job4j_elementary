package ru.job4j.converter2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Converter2Test {

    @Test
    public void  whenConvert33000RblThen379Euro() {
        float inE = 33000;
        float expectedE = (float) 379.52847;
        float outEuro = Converter2.rubleToEuro(inE);
        float eps = 0.0001f;
        Assert.assertEquals(expectedE, outEuro, eps);

    }

    @Test
    public void whenConvert150000RblThen2049Dlr() {
        float inD = 150000;
        float expectedD = (float) 2049.1804;
        float outDollar = Converter2.rubleToDollar(inD);
        float eps = 0.0001f;
        Assert.assertEquals(expectedD, outDollar, eps);

    }
}