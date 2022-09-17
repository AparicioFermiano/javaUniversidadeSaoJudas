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
public class ex6 {
    public static void main(String[] args) {
        Double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        Double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        Double v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        String msg;
        if(v1 < v2 & v1 < v3){
            if(v2 < v3){
                msg = (v1+", "+v2+", "+v3);
            } else {
                msg = (v1+", "+v3+", "+v2);
            }
        } else if(v2 < v1 & v2 < v3){
            if(v1 < v3){
                msg = (v2+", "+v1+", "+v3);
            } else {
                msg = (v2+", "+v3+", "+v1);
            }
        } else {
            if(v1 < v2){
                msg = (v3+", "+v1+", "+v2);
            } else {
                msg = (v3+", "+v2+", "+v1);
            }
        }
        JOptionPane.showMessageDialog(null, String.format("A ordem é: "+ msg));
    }
}
