/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class ex10 {
    public static void main(String[] args) {
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
        Double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor C: "));
        double x1 = 0;
        double x2 = 0;     
        double delta = ((Math.pow(b, 2))-(4*a*c));
        if(delta < 0){
            JOptionPane.showMessageDialog(null, String.format("Não existem raizes reais."));
        }
        else {
            x1 = ((-1*b) + (Math.sqrt(delta))) / (2 * a);
            x2 = ((-1*b) - (Math.sqrt(delta))) / (2 * a);
        }
        JOptionPane.showMessageDialog(null, String.format("x1 = "+ x1 + "\nx2 = "+ x2));
        
    }
}
