/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    public static void main(String[] args){
        
        //Make the array of numbers for testing
        int[] arr = {1, 2, 3, 4, 5};
        
        //Find this number as key
        int key = 3;
        
        //Establish low and high variable 
        int low = 0;
        int high = arr.length -1;
        
        //Call the sorting method
        int result = runBinarySearchIteratively(arr, key, low, high);
        
        //Output
        if (result == Integer.MAX_VALUE) {
            System.out.println("Key missing");
        }
        else {
            System.out.println("Key is located at " + result);
        }
    }
    
    //The time complexity of the sort here is O(log n), each iteraton halves the search time
    //The space complexity of this search is O(1) as only one variable takes up space.

}
