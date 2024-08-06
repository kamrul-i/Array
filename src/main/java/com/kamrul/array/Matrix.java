package com.kamrul.array;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);    
        //2 Dimenstional array dicleare 
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //---------------------------------------------------------------
        //input from user & initialize it.
        System.out.println("Enter element for A matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col); //-----(3)
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        //input from user & initialize it.
        System.out.println("Enter element for B matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ", row, col); //-----(3)
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        //---------------------------------------------------------------
        //print A matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]); //------(1)
            }
            System.out.println(); //--------(2)
        }
        System.out.println();
        //print B matrix
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]); //------(1)
            }
            System.out.println(); //--------(2)
        }
        System.out.println();
        //---------------------------------------------------------------
    }
    /*
    এখানে multiple array declare করা হয়েছে।।
    
    ১নং সমীকরণের space না হলে সকল result একসাথে একত্র হয়ে থাকবে, কিছু বুঝার মতো থাকবে না।।
    2নং সমীকরণের এই nextline ব্যবহার না করলে সকল result এক line-এ দেখাবে।।
    3নং সমীকরণের এই line, প্রথমেই একটি demo দেখাবে, সে কিভাবে input নিতে চায়।।

     */
}
