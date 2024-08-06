package com.kamrul.array;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //2 Dimenstional array dicleare 
        int[][] A = new int[2][3];
        
        //input from user & initialize it.
        System.out.print("Enter A matrix input : ");
        for (int[] number : A) {
            for (int col = 0; col < 3; col++) {
                number[col] = input.nextInt();
            }
        }
        
        //print matrix 
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]); //--------(1)
            }
            System.out.println(); //--------(2)
        }
    }
    
    /*
    ১নং সমীকরণের space না হলে সকল result একসাথে একত্র হয়ে থাকবে, কিছু বুঝার মতো থাকবে না।।
    ২নং সমীকরণের এই nextline ব্যবহার না করলে সকল result এক line-এ দেখাবে।।

    Array size যতো হবে, array initialize ততো হবে।। 
    array size কখনো negative number হয় না।।
     */
}
