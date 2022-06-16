package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Locale;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testFormatBigDecimalBaseOnEnUSLocaleThatReturnsString(){
        String expectedString = "123,124.123";
        Assert.assertEquals(expectedString, App.formatString(new Locale("en", "US"), new BigDecimal("123124.123123")));;
    }

    @Test
    public void test2FormatBigDecimalBaseOnEnUSLocaleThatReturnsString(){
        String expectedString = "1,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,111,123,124.111";
        Assert.assertEquals(expectedString, App.formatString(new Locale("en", "US"), new BigDecimal("1111111111111111111111111111111111111111111111111111111111111111111123124.11111111111111111111111111111111111111111111111111111111111111231123")));;
    }
}
