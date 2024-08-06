package com.kamrul.array;
public class Two_Dimensional_array {
    public static void main(String[] args) {

        //2 Dimensional array declare 
        int[][] number = new int[2][3];  //2,3 কে array size বলে, এটা যেকোন সংখ্যা হতে পারে।।
        //array initialize -----------------(1)
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

        //print by loop system 
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + number[row][col]); //--------(1)
            }
            System.out.println();  //--------(2)
        }
    }
    /*
    ১নং সমীকরণের space না হলে সকল result একসাথে একত্র হয়ে থাকবে, কিছু বুঝার মতো থাকবে না।।
    ২নং সমীকরণের এই nextline ব্যবহার না করলে সকল result এক line-এ দেখাবে।।
    
    Array size যতো হবে, array initialize ততো হবে।। 
    Array size বলতে Dimensional দুটির গুণফল যতো হবে, ততেটি array initialize করতে হবে।।
    array size এর তুলনায় initialize কম হলে সমস্যা হয় না, তবে বেশি initialize করে নিলে সমস্যা হয়।।
    array size কখনো negative number হয় না।।
    
     */

}
