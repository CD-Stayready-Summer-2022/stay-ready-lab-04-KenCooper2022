package com.codedifferently;

public class WuBuzz {
    /**
     * Write a short program that prints each number from 1 to n on a new line.
     * <p>
     * For each multiple of 3, print "Wu" instead of the number.
     * <p>
     * For each multiple of 5, print "Tang" instead of the number.
     * <p>
     * For numbers which are multiples of both 3 and 5, print "WuTang Forever" instead of the number.
     * Example :
     * 1
     * 2
     * Wu
     * 4
     * Tang
     * Wu
     * 7
     * 8
     * Wu
     * Tang
     * 11
     * Wu
     * 13
     * 14
     * WuTangForever
     * @return
     */
    public String wuTangClan(int n) {

        String res = "";
        for(int i=1;i<n+1;i++){
            if(((i%5==0)&&(i%3==0))){
                res = res+"WuTang Forever"+"\n";
                System.out.println(i);
            }else if (i%3==0){
                res= res+"Wu"+"\n";
            }else if(i%5==0){
                res = res+"Tang"+"\n";
            }else{
                res=res+i+"\n";
            }
        }
        return res;


    }

}


