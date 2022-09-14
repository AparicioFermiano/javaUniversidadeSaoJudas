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
public class ex2 {
    public static void main(String[] args) {
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        String sexo = JOptionPane.showInputDialog("Digite seu sexo: ").toLowerCase();
        double peso = 0;
        if(sexo.equals("masculino")){
            peso = 72.7 * altura - 58;
        } else if(sexo.equals("feminino")){
            peso =  62.1 * altura - 44.7;
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + peso);
    }
}
