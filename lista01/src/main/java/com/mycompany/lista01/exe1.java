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
public class exe1 {
    public static void main(String[] args) {
        Double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor: "));
        Double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor: "));
        Double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro valor: "));
        double total = v1 * v2 * v3;
        JOptionPane.showMessageDialog(null, "O resultado é: " + total);
    }
}
