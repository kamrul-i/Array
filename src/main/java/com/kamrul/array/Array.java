package com.kamrul.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //One Dimenstional array declare
        double[] number = new double[5]; //5-কে array size বলে, এটা যেকোন সংখ্যা হতে পারে।।
        double sum = 0;
        System.out.println("Please Enter any 5 numbers : ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();

        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The sum is : " + sum);
    }

    /*
    user-এর কাছ থেকে input নিয়ে array যোগ করা হয়েছে।।
    
    Array size যতো হবে, array initialize ততো হবে।।  
    array size এর তুলনায় initialize কম হলে, সমস্যা হয় না, তবে বেশি initialize করে নিলে সমস্যা হয়।।
    array size কখনো negative number হয় না।।
    
    user-এর কাছ থেকে যতো input নিবেন, input গুলো receive করার জন্য ততোবার initialize করতে হবে।। 
    এটা অনেক ঝামেলা, পরবর্তী commit-এ loop-এর মাধ্যমে সংক্ষেপে initialize করা হয়েছে।।
        
     */
}
