package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
a) Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.
**/

public class ex1 {
    public static void main(String[] args) {
        Integer entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de valores: "));
        int i = 0;
        double total = 0;
        while(i < entrada){
           Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
           total = total + valor;
           i ++;
        }
        JOptionPane.showMessageDialog(null, String.format("O total da soma é: "+ total));
    }
}
