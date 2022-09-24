package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
 e) [for] Desenvolva um programa que exibe a tabuada de um número natural
 escolhido pelo usuário. Os múltiplos apresentados devem ser de 1 a 10.
 */

public class ex3 {
   public static void main(String[] args) {
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tabuada gostaria de ver: "));
        int total = 0;
        for (int j = 0; j <= 10; j++) {
            total = valor * j;
            JOptionPane.showMessageDialog(null, String.format(j + " * "+ valor + " = " + total));
        }
    } 
}