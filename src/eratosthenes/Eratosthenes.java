/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenes;

import java.util.Scanner;

/**
 *
 * @author shuuakira
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner arc = new Scanner(System.in);
        a = arc.nextInt();
        arc.close();
        
        boolean numbers[] = new boolean[1000];
        numbers[0] = false;
        for (int b = 1; b < a; b++){
            numbers[b] = true;
        }
        
        for (int i = 2; i <= a; i++){
            if(numbers[i-1]){
                System.out.println(i);
                for (int c = i*i; c <= a; c += i){
                    numbers[c-1] = false;
                }
            }
        }
    }
    
}
