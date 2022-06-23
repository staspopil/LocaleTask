package org.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Locale locale = new Locale("en", "US");
    public static List<Locale> localeList = new LinkedList<Locale>();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        formatString(locale, new BigDecimal("123124.123123"));
    }

    public static String formatString(Locale locale, BigDecimal bigDecimal)
    {
        NumberFormat numberFormatBaseOnLocale = NumberFormat.getInstance(locale);
        System.out.println("Number in Locale:" + locale + " - " + numberFormatBaseOnLocale.format(bigDecimal));
        return numberFormatBaseOnLocale.format(bigDecimal);
    }
}
