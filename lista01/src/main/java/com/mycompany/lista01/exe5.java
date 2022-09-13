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
public class exe5 {
    public static void main(String[] args) {
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo: "));
        double area = base*altura;
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é: "+area);
    }
}
