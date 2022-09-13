/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class Lista01 {

    public static void main(String[] args) {
        Integer anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        Integer anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        int idade = anoAtual-anoNascimento;
       
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos");
    }
}