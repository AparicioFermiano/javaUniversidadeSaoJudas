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
public class exe6 {
    public static void main(String[] args) {
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
