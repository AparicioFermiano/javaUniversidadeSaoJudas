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
public class exe11 {
    public static void main(String[] args) {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        Double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite a soma de todas as vendas: "));
        double comissao = vendas*4/100;
        double salarioTotal = salario+comissao;
        
        JOptionPane.showMessageDialog(null, "Seu salário esse mês foi de R$"+salarioTotal+"\n Sua comissao foi de R$"+comissao);
    }
}
