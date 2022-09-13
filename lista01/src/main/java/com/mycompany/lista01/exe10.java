/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class exe10 {
    public static void main(String[] args) {
        Double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota: "));
        Double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota: "));
        double peso1 = 2;
        double peso2 = 3;
        double media = ((p1*peso1)+(p2*peso2))/(peso1+peso2);
        
        JOptionPane.showMessageDialog(null, "A média ponderada é: "+media);
    }
}
