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
public class ex14 {
    public static void main(String[] args) {
        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de um nadador: "));
        String categoria;
        if (idade >= 0 && idade <= 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 14) {
            categoria = "Junior";
        } else if(idade >= 15 && idade <= 20) {
            categoria = "Adolescente";
        } else if(idade >= 21 && idade <= 35) {
            categoria = "Jovem";
        } else {
            categoria = "Máster";
        }
            
        JOptionPane.showMessageDialog(null, String.format("A categoria do nadador é: "+ categoria));
    }
}
