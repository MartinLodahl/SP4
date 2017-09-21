/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.ex1;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MartinLodahl
 */
public class Thread2 extends Thread  {
    
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
