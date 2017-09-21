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
public class MyThread extends Thread {
    
    Even even;
    
    MyThread(Even even){
        this.even=even;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int j = even.next();
            if(j%2==1){
                System.out.println("Even is uneven: "+j);
            }
        }
    }
}
