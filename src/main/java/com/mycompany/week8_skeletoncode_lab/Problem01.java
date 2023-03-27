/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    int[] arr = new int[n+1];
    long[] sumPrime = new long[n+1];
    
    for(int i = 2; i*i <= n; i++){
        if(arr[i] == 0){
            for(int hold = i*i; hold <= n; hold += i){
                arr[hold] = 1;
            }
        }
    }
    
    for(int i = 2; i <= n; i++){
        if(arr[i] == 0){
            sumPrime[i] = sumPrime[i-1] + 1;
        }
        else {
            sumPrime[i] = sumPrime[i-1];
        }
    }
    return sumPrime[n];
    }
    
    //The time complexity of this algorithm is O(n log log n) which will grow slower depending on n
    //Space complexity is O(n) 
    
    
    public static void main(String[] args){
        //Test case for n = 10
        //Sum of primes between 1 and 10
        long expected1 = 17; 
        
        //Call the sumOfPrimes method
        long actual1 = getSumOfPrimes(10);
        assert expected1 == actual1 : "Numbers not equal for test 1";
        
        
        //Case 2, same logic applies
        long expected2 = 77;
        long actual2 = getSumOfPrimes(20);
        assert expected2 == actual2 : "Numbers not equal for test 2";
        
        System.out.println("All numbers equal to the sum of prime");
    }
    
}
