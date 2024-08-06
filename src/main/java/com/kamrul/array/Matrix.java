package com.kamrul.array;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //2 Dimenstional array dicleare 
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

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
                B[row][col] = input.nextInt();
            }
        }
        System.out.println();
        //---------------------------------------------------------------
        //print A matrix
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]); //------(1)
            }
            System.out.println(); //--------(2)
        }
        System.out.println();

        //print B matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]); //------(1)
            }
            System.out.println(); //--------(2)
        }
        System.out.printf("\n");
        //---------------------------------------------------------------

        //Multiplication of all matrix 
        System.out.print("A*B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] * B[row][col];
                System.out.print("\t " + C[row][col]);
            }
            System.out.println();
        }
        //---------------------------------------------------------------
    }
    /*
    এখানে multiple array declare করে গুণ করা হয়েছে।।
    
    ১নং সমীকরণের  '\t'  result কে খুবই সাজানো-গোছানো অবস্থায় দেখতে সাহায্য করবে।।
    2নং সমীকরণের এই nextline ব্যবহার না করলে সকল result এক line-এ দেখাবে।।
    3নং সমীকরণের এই line, প্রথমেই একটি demo দেখাবে, সে কিভাবে input নিতে চায়।।
    
     */
}
