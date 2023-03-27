/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    
    
    
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         
         //Start for loop to run through array
         for (int i = 0; i < n; i++) {
             
             //Check if the n is rqual to x
             if(arr[i] == x) {
                 //Return index location
                 return i;
             }
         }
         
         //If the index is not found, output -1
         return -1;
    }
    
    //Best case for algorithm complexity would be O(1) as it would need to only check
    //the first element in the array and nothing more. 
    //Worst case scenario would be O(n), this would be the case where the loop needs to 
    //endlessley go through the loop to find the correct location.
    
    //Test for search
    public static void main (String[] args) {
        
        //Small array for test
        int[]arr = {10, 20, 30, 40, 50};
        
        //If value matches one in the array, it will print 
        //out the position it has in the array
        System.out.println(search(arr, 10));
        System.out.println(search(arr, 20));
        System.out.println(search(arr, 70));
        
    } 
    
    
}
