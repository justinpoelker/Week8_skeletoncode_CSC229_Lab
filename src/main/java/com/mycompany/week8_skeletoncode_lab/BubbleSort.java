/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import java.util.Arrays;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                //Identify if the array is out of order
                if(a[inner] > a [inner +1]){
                temp = a [inner];
                
                //Swap until in correct order
                a[inner] = a[inner +1];
                a[inner + 1] = temp;
                }
            }
        }
    }
    
    //This bubble sort could possibly have the time complexity of O(n) in the average case as it needs to loop
    //through the array multiple times to get the sorting correct by swapping.
    //The worst case scenario for time complexity would be O(n^2) because there are 2 nested loops that are iterating
    //within the array elements.
    
    //Test
    public static void main(String[] args){
        
    //Generate array
    int[] input = {65, 11, 4, 3, 99};
    
    //Call the bubbleSort
    bubbleSort(input, input.length);
    
    //Output
    System.out.println(Arrays.toString(input));
    
    
    }
}