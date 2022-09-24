package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
l) Faça um programa que recebe um número natural e exibe a soma de todos os
 * valores de zero até o número digitado. Exemplo: se receber o valor 5, deve
// * exibir 15 (0 + 1 + 2 + 3 + 4 + 5).
 */

public class ex4 {
    public static void main(String[] args) {
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int total = 0;
        int i = 0;
        while(i <= valor) {
            total += i;
            i ++;   
        }
        JOptionPane.showMessageDialog(null, String.format("O total é: " + total));
    }
}
