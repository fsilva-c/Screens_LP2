/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Screens.Login;
import javax.swing.JFrame;

/**
 *
 * @author qwerty
 */
public class Main {
    static JFrame mainScreen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(mainScreen == null){
            mainScreen = new Login();
            mainScreen.setLocationRelativeTo(null);
        }
        mainScreen.setVisible(true);
    }
    
}
