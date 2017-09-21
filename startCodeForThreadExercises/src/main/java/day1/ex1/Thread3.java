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
public class Thread3 extends Thread {
    private long l = 10;
    
    private boolean bol = true;

    public void setBol(boolean bol) {
        this.bol = bol;
    }
    
    @Override
    public void run(){
        while(bol) {
            System.out.println(l);  
            l++;
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
