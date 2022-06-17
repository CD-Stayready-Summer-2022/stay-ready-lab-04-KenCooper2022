package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDLoops01Test {
    @Test
    public void oneToTenTest(){
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assertions.assertEquals( expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

        String actual = numbers.oddNumbers();
        //: Then

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "squares " + "\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100\n121\n144\n169\n196\n225" +
                "\n256\n289\n324\n361\n400\n441\n484\n529\n576\n625";

        //: When
        String actual = numbers.squares();

        //: Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given
        TDDLoops01 numbers=  new TDDLoops01();
        String expected = "this number is even";
        //: When
        String actual=numbers.even(2);

        //: Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void powersTest(){
        //: Given
        TDDLoops01 numbers=  new TDDLoops01();
        String expected = "1\n8\n27\n64\n125\n216\n343\n512\n729\n1000\n";
        //: When
        String actual = numbers.powers(3);

        //: Then
        Assertions.assertEquals(expected,actual);
    }
}
