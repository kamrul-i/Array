package com.kamrul.array;

import java.util.Scanner;

public class Diagonal_Matrix {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //2 Dimenstional array dicleare 
        int[][] A = new int[3][3];
        
        int sum_Of_Diagonal_elements = 0;
        int sum_of_Upper_elements = 0;
        int sum_Of_lower_elements = 0;

        //input from user & initialize it.
        System.out.println("Enter element for diagonal matrix :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();

        //diagonal, uper & lower------------
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    sum_Of_Diagonal_elements = sum_Of_Diagonal_elements + A[row][col];
                }
                if (row < col) {
                    sum_of_Upper_elements = sum_of_Upper_elements + A[row][col];
                }
                if (row > col) {
                    sum_Of_lower_elements = sum_Of_lower_elements + A[row][col];
                }
            }
        }
        System.out.println("Sum Of Diagonal elements : " + sum_Of_Diagonal_elements);
        System.out.println("Sum of Upper elements    : " + sum_of_Upper_elements);
        System.out.println("Sum Of lower elements    : " + sum_Of_lower_elements);
    }
    
    /*
    Diagonal Matrix
    Diagonal elements 
    একই row & col এর index কে Diagonal elements বলে।। যেমন, row[0],col[0] / row[1],col[1] / row[2],col[2]
    row এর index চেয়ে, বড় col এর index কে upper triangle elements বলে।। যেমন, row[0],col[1] / row[0],col[2] / row[1],col[2] যাই থাকুক।।
    row এর index চেয়ে, ছোট col এর index কে lower triangle elements বলে।। যেমন, row[1],col[0] / row[2],col[0] / row[2],col[1] যাই থাকুক।।
    
        1   2   3
        4   5   6
        7   8   9
    
    1 হলো row[0],col[0]
    5 হলো row[1],col[1]
    9 হলো row[2],col[2] 
    এই number গুলোর row & col number একই, তাই এগুলো Diagonal elements.
    
    2 হলো row[0],col[1]
    3 হলো row[0],col[2]
    6 হলো row[1],col[2]
    এই number গুলোর row এর index থেকে, col এর index বড়।। তাই এগুলো upper triangle elements.
    
    4 হলো row[1],col[0]
    7 হলো row[2],col[0]
    8 হলো row[2],col[1]
    এই number গুলোর row এর index থেকে, col এর index ছোট।। তাই এগুলো lower triangle elements.
    
    Diagonal Matrix-এ র্বগমূল হিসেবে কাজ করতে হয়, 
    যেমন এখানে 3/3 number দ্বারা কাজ করে দেখানো হয়েছে, এভাবে 4/4, 5/5 number দ্বারা কাজ করতে হয়।।
    */
}
