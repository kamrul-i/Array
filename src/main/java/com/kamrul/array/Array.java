package com.kamrul.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //One Dimenstional array declare
            double number[] = new double[5]; //5-কে array size বলে, এটা যেকোন সংখ্যা হতে পারে।।
            double sum = 0;
            System.out.println("Please Enter any 5 numbers : ");

            for (int i = 0; i < number.length; i++) {  //----------(1)
                number[i] = input.nextDouble();
            }
            double max = number[0];
            for (int i = 1; i < 5; i++) {
                if (max < number[i]) {
                    max = number[i];
                }
            }
            System.out.println("Maximum number is : " + max);
        }
    }
    //1নং সমীকরণে user-এর দেওয়া input গুলো loop-এর মাধ্যমে করা initialize হয়েছে।।
}
