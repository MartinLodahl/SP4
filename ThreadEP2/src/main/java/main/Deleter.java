/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MartinLodahl
 */
public class Deleter extends Thread {

    ApiResource api;

    Deleter(ApiResource api) {
        this.api = api;
    }

    public void run() {
        while (true) {
            try {
                sleep(1000000000); //Sleep(x)
                api.setGroups( new ArrayList());
            } catch (InterruptedException ex) {
                Logger.getLogger(Deleter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
