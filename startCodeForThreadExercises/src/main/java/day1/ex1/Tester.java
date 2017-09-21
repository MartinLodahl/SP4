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
public class Tester {

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);
        t3.setBol(false);
        
    }

}
