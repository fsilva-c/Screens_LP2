/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen_restaurant;

import Screens.login;
import javax.swing.JFrame;

/**
 *
 * @author qwerty
 */
public class Screen_Restaurant {
    static JFrame mainScreen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(mainScreen == null){
            mainScreen = new login();
            mainScreen.setLocationRelativeTo(null);
        }
        mainScreen.setVisible(true);
    }
    
}
