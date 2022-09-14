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
public class ex4 {
    public static void main(String[] args) {
        Double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double menor = (v1 < v2) ? v1 : v2;
        JOptionPane.showMessageDialog(null, String.format("O valor %.2f é menor!", menor));
    }
}
