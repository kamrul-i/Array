package com.kamrul.array;
public class Array {

    public static void main(String[] args) {
        //One Dimenstional array declare
        int[] number = new int[5];  //5-কে array size বলে, এটা যেকোন সংখ্যা হতে পারে।।
        //array initialize
        number[0] = 10;
        number[1] = 15;
        number[2] = 20;
        number[3] = 25;
        number[4] = 30;

        // array index use
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The sum is = " + sum);

        int len = number.length;  //array size show
        System.out.println("Array size = " + len);
    }

    /*
        Array size যতো হবে, array initialize ততো হবে।।  
        array size এর তুলনায় initialize কম হলে সমস্যা হয় না, তবে বেশি initialize করে নিলে সমস্যা হয়।।
        array size কখনো negative number হয় না।।
        
        বি.দ্র.: array নামে same class create করতে পারবেন না।। যদিও এখানে সমস্যা করছে না, তবে app crush করবে।।
        
        1. Array static হিসেবে কাজ করে।।
        2. Array -কে resize করা যায় না, Array -তে size নির্ধারণ করে দিতে হয় ।। 
        3. Array -এ (for, for each) loop ব্যবহার করা হয় ।। 
        4. Array দ্রুত কাজ করে, ArrayList অপেক্ষাকৃত slow কাজ করে।।
        5. Array -এর ক্ষেত্রে array.length ব্যবহার করা হয় ।।
        
        */
}
