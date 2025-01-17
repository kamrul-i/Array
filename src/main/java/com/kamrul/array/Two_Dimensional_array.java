package com.kamrul.array;
public class Two_Dimensional_array {
    public static void main(String[] args) {

        //2 Dimenstional array dicleare 
        int [][] number = new int [4][];
        int count = 0;
        
        //array initialize
        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                number[row][col] = count;
                count++;
            }
        }
        
        //print by loop system
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(" "+number[row][col]); //--------(1)
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
    
    বি:দ্র: এটা "C programming pattern" folder এর commit no- "floyd triangle number" এর মতো result দেখায়।। 
     */

}
