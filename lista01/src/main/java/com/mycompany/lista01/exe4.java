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
public class exe4 {
    public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        double gratificacao = salario * 0.05;
        double impostos = salario * 0.07;
        double salarioAjustado = salario + gratificacao - impostos;

        JOptionPane.showMessageDialog(null, "Seu salário ajustado é: " + salarioAjustado + "\nImpostos: " + impostos + "\ngratificacao: " + gratificacao);
    }
}
