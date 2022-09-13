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
public class exe3 {
    public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        double salarioAjustado = salario*1.25;
        
        JOptionPane.showMessageDialog(null, "Seu salário ajustado é: "+salarioAjustado);
    }
}
