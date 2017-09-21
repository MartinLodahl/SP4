/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.ex1;

/**
 *
 * @author MartinLodahl
 */
public class Thread1 extends Thread {
    
    private long sum;
    
    @Override
    public void run(){
        for (int i = 0; i < 1000000; i++) {
            sum +=i;
        }
        System.out.println("sum: " + sum);
    }
}
