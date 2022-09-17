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
public class ex11 {
    public static void main(String[] args) {
        Integer dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o o dia da primeira data: "));
        Integer mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da primeira data: "));
        Integer ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data: "));
        Integer dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o o dia da primeira data: "));
        Integer mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da primeira data: "));
        Integer ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data: "));
        String data_recente = "";
        if(ano2 > ano){
            data_recente = String.format("A data mais recente é: " + dia2 + "/" + mes2 + "/" + ano2);
        }
        else if (ano2 < ano){
            data_recente = String.format("A data mais recente é: " + dia + "/" + mes + "/" + ano);
        }
        else {
            if (mes2 > mes) {
                data_recente = String.format("A data mais recente é: " + dia2 + "/" + mes2 + "/" + ano2);
            } else if (mes2 < mes) {
                data_recente = String.format("A data mais recente é: " + dia + "/" + mes + "/" + ano);
            }
            else {
                if (dia2 > dia) {
                    data_recente = String.format("A data mais recente é: " + dia2 + "/" + mes2 + "/" + ano2);
                } else if (dia2 < dia) {
                    data_recente = String.format("A data mais recente é: " + dia + "/" + mes + "/" + ano);
                }
            }
        }
        JOptionPane.showMessageDialog(null, data_recente);
       
    }
}
