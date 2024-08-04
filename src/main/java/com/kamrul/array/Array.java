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
            for (int i = 0; i < number.length; i++) {  //----------(2)
                sum = sum + number[i];
            }
            System.out.println("The sum is : " + sum);
        }
    }

    /*
    user-এর input দ্বারা loop এর মাধ্যমে array যোগ করা হয়েছে।।
    
    1নং সমীকরণে user-এর দেওয়া input গুলো loop-এর মাধ্যমে করা initialize করা হয়েছে, যা আগের commit-এ ঝামেলার বলা হয়েছিল।।
    ২নং সমীকরণে user input কে যোগ করা হয়েছে, তারপর result দেখানো হয়েছে।। 
     */
}
