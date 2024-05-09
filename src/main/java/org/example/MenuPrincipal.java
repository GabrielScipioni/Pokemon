package org.example;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {
    Image icono=Toolkit.getDefaultToolkit().getImage("Doc/img/menu/iconomenu.png");
    public void iniciarMainMenu(){
        //iniciar una ventana
        JFrame mainMenu = new JFrame("Pokemon");
        mainMenu.setSize(500,350);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setIconImage(icono);
        //layouts para organizar los componentes
        JPanel panel =new JLabel(new GridLayout(3,1));

        mainMenu.getContentPane().add(imageLabel,BorderLayout.CENTER);
        mainMenu.setVisible(true);
    }
}
