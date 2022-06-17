package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.SortExample.*;
import static java.util.Arrays.binarySearch;

public class SortExampleTest {
    @Test
    @DisplayName("selection sort test")
    public void selectionSortTest(){
        int[]numbers= {40, 6,59, 4, 1};
        String expected  = "1 4 6 40 59 ";
        String actual = displayValues(selectionSort(numbers));
        Assertions.assertEquals(expected,actual);
        // you can also just use Assertsions .assertArrayEquals

    }
    @Test
    @DisplayName("bubble sort tes ")
    public void bubbleSortTest(){
        int[]numbers= {40, 6,59, 4, 1};
        int []expected = {1, 4,6, 40,59};
        int[]actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    @DisplayName("sequential search")
    public void sequentialSort(){
        int[]numbers= {40, 6,59, 4, 1};
      int  actual= sequentialSearch(numbers,4);
      int expected =900;
      Assertions.assertEquals(expected,actual);


    }
    @Test
    @DisplayName("binary search")
    public void binarySearchTest(){
        int[]numbers= {40, 6,59, 4, 1};
       int[] test= bubbleSort(numbers);
        int expected = 4;
        int actual =binarySearch(test,4);
        Assertions.assertEquals(expected,actual);

    }


}
