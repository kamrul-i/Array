package com.kamrul.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //One Dimenstional array declare
            double number[] = new double[8]; //5-কে array size বলে, এটা যেকোন সংখ্যা হতে পারে।।
            double sum = 0;
            System.out.println("Please Enter any 8 numbers : ");

            for (int i = 0; i < number.length; i++) {  //----------(1)
                number[i] = input.nextDouble();
            }
            double max = number[0];
            double min = number[0];
            for (int i = 1; i < number.length; i++) {

                if (max < number[i]) {
                    max = number[i];
                }
                if (min > number[i]) {
                    min = number[i];
                }
            }
            System.out.println("Maximum number is : " + max);
            System.out.println("Minimum number is : " + min);
        }
    }
    //1নং সমীকরণে user-এর দেওয়া input গুলো loop-এর মাধ্যমে করা initialize হয়েছে।।
}
