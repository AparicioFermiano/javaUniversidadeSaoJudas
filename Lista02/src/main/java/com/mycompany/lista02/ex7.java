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
public class ex7 {
    public static void main(String[] args) {
        Double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        Integer operador = Integer.parseInt(JOptionPane.showInputDialog("Escolha um operador:\n(1)Soma\n(2)Subtração\n(3)Multiplicação\n(4)Divisão"));
        Double total;
        total = switch (operador) {
            case 1 -> v1 + v2;
            case 2 -> v1 - v2;
            case 3 -> v1 * v2;
            case 4 -> v1 / v2;
            default -> 0.0;
        };
        JOptionPane.showMessageDialog(null, String.format("O total é: "+ total));
    }
}
