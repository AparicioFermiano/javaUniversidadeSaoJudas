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
public class ex5 {
    public static void main(String[] args) {
        Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        String valor = (v1 % 2 == 0) ? "par": "impar";
        JOptionPane.showMessageDialog(null, String.format("O valor é "+ valor+"."));
    }
}
