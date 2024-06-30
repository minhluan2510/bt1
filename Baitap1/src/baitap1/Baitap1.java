/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author luanq
 */
public class Baitap1 {
    public static boolean Prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
        return false;
        }
        return true;
    }
    public static boolean Odd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
      
        int a = 17;
        int b = 25;

        
        if (Prime(a) && Odd(b)) {
            System.out.println("Số " + a + " là số nguyên tố và số " + b + " là số lẻ.");
        } else {
            System.out.println("Số " + a + " không phải là số nguyên tố hoặc số " + b + " không phải là số lẻ.");
        }
    }
}


