/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author MartinLodahl
 */
public class MyThread extends Thread {

    List<String> lines = new ArrayList();

    @Override
    public void run() {
        while (true) {
            try {
                wait(15000);

                String userDir = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
                /* Open a text file for writing without append. This means, existing content will be overwritten */
                FileWriter writer;
                try {
                    writer = new FileWriter("" + userDir + "\\backup.txt", false);
                    try (PrintWriter out = new PrintWriter(writer)) {
                        for (int i = 0; i < lines.size(); i++) {
                            out.println(lines.get(i));
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
