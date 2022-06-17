package com.codedifferently;

public class SortExample {
    public static void main(String[] args) {
        int[]numbers= {40, 6,59, 4, 1};
        displayValues(numbers);
       int []sortedNumbers=  selectionSort(numbers);
        displayValues(sortedNumbers);
    }
    public static int[] selectionSort(int []numbers){
        int indexMin =0;
        for(int i =0; i<numbers.length;i++){
            indexMin = i;
            for(int j = i+1; j<numbers.length;j++){
                if(numbers[j]<numbers[indexMin]){
                    indexMin=j;
                }
            }
            int temp = numbers[i];
            numbers[i]= numbers[indexMin];
            numbers[indexMin] =temp;
        }
        return numbers;
    }
    public static String  displayValues(int[]numbers) {
        String returnNum = "";
        for (int i = 0; i < numbers.length; i++) {
            returnNum = returnNum+numbers[i] + " ";
        }
        return returnNum;

    }
    public static int[] bubbleSort(int[]numbers){
        for(int i=0; i<numbers.length;i++){
            for(int j  =0; j<numbers.length-1; j++){
                if(numbers[j]>numbers[j+1]){
                    int temp =numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        return numbers;

    }

    public static int  sequentialSearch(int[]numbers, int value )throws NullPointerException{
        int res=0;
        for(int i =0; i<numbers.length;i++) {
            if (numbers[i] == value) {
                res=value;
            }else{
            }
        }
        System.out.println("number not in list ");
        return res;
    }
    public int  binarySearch(int []numbers, int value){
        int low = 0;
        int high = numbers.length -1;
        while(high>=low){
            int middle = (low +high)/2;
            if(numbers[middle]==value){
                return value;
            }
            if(numbers[middle]<value){
                low = middle +1;
            }
            if(numbers[middle]>value){
                high = middle-1;
            }

        }
        return 0;
    }




}
