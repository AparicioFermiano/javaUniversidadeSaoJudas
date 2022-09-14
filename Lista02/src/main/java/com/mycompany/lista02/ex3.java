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
public class ex3 {
    public static void main(String[] args) {
        Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Integer v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int maior = (v1 > v2) ? v1 : v2;
        JOptionPane.showMessageDialog(null, "O valor " + maior + "é maior!");
    }
}
