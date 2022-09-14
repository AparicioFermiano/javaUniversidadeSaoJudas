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
public class ex1 {
    public static void main(String[] args) {
        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = Math.rint((n1+n2)/2);
        String msg;
        if(media >= 6){
            msg = "Aprovado";
        } else {
            msg = "Reprovado";
        }
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media+"\nO aluno foi "+ msg);
    }
}
