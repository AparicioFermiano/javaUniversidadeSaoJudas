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
public class exe7 {
    public static void main(String[] args) {
        Double perimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o perímetro do círculo "));
        double raio = perimetro / (2 * 3.14);
        double area = Math.rint(3.14 * (Math.pow(raio, 2)));

        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}
