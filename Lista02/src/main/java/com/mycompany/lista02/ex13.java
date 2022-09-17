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
public class ex13 {
    public static void main(String[] args) {
        Integer cc = Integer.parseInt(JOptionPane.showInputDialog("Digite as cilindradas do veículo: "));
        String categoria;
        if (cc >= 0 && cc <= 120) {
            categoria = "Sub Production";
        } else if (cc >= 121 && cc < 240) {
            categoria = "Production";
        } else if(cc >= 240) {
            categoria = "Super Production";
        } else {
            categoria = "Não encontrada";
        }
        JOptionPane.showMessageDialog(null, String.format("O veículo é da categoria: "+ categoria));
    }
}
