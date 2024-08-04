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

        //print by normal system -----------(2)
        System.out.println(number[0][0]);
        System.out.println(number[0][1]);
        System.out.println(number[0][2]);

        System.out.println(number[1][0]);
        System.out.println(number[1][1]);
        System.out.println(number[1][2]);
    }
    /*
    এটা সম্পূর্ণ প্রাথমিক শিক্ষা, result এখানে যেরকম আছে সেরকম দেখাবে, কোন সাজানো গোছানো দেখাবে না।।
    see next commit.
    
    Array size যতো হবে, array initialize ততো হবে।। 
    Array size বলতে Dimensional দুটির গুণফল যতো হবে, ততেটি array initialize করতে হবে।।
    array size এর তুলনায় initialize কম হলে সমস্যা হয় না, তবে বেশি initialize করে নিলে সমস্যা হয়।।
    array size কখনো negative number হয় না।।
    
     */

}
