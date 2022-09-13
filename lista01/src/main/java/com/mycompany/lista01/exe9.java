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
public class exe9 {
    public static void main(String[] args) {
        Integer idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        Integer anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        int idadeViradaSeculo = 2100 - anoAtual + idadeAtual;

        JOptionPane.showMessageDialog(null, "Você vai ter " + idadeViradaSeculo + " no próximo século");
    }
}
