package com.codedifferently;

public class TDDLoops01 {
    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }

        return output;
    }
    // prints out all the numbers squared 1-25 in the same format as above
    public String squares(){
        String output = "squares ";
        for(int i =1;i<=25;i++){
            output=output+"\n"+i*i;
        }
        return output;
    }

    public String random4(){
        return "";
    }// don't have to do this one but you can

    public String even(int n){
        String output="";
        if(n%2==0){
            output="this number is even"+output;
        }else{
            output="this number is odd"+output;
        }
        return output;
    }// takes int he vlaue of n and checks to see if it's even
                                            // output is a string that says is it even or odd

    public String powers(int n){
        String output= "";
        for(int i =1;i<=10;i++){
            output=output + (int)Math.pow(i,n) +"\n";
        }
        return output;
    }// prints out 1 to the power of n , 2 to power of n up till a poitn
    

    public static void main(String[] args) {
        TDDLoops01 loops01 = new TDDLoops01();
        String output = loops01.oddNumbers();
        System.out.println(output);
    }

}