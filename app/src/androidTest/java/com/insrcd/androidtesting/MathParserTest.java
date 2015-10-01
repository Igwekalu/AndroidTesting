package com.insrcd.androidtesting;

import android.test.AndroidTestCase;

import com.insrcd.androidtesting.math.MathParser;

/**
 * Created by ashaw on 10/1/15.
 */
public class MathParserTest extends AndroidTestCase {
    public void testParse(){
        MathParser parser = new MathParser("5+5");

        assertEquals(parser.parse(), 10.0d);

        parser = new MathParser("2 + 5 * 5");

        assertEquals(parser.parse(), 27.0d);
    }
}
