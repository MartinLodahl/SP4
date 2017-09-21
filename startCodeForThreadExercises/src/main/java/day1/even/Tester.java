/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.even;

/**
 *
 * @author MartinLodahl
 */
public class Tester {
    
    public static void main(String[] args) throws InterruptedException {
        Even even = new Even();
        MyThread t1 = new MyThread(even);
        MyThread t2 = new MyThread(even);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
    }
    
}
