package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
g) [for] Faça um programa que lê um número natural e exibe o fatorial desse
 * número. Lembre-se: 5! é 120, porque 5 × 4 × 3 × 2 × 1 = 120. Use um
 * acumulador e um contador dentro de um laço de repetição.

 */

public class Lista03 {

    public static void main(String[] args) { 
        int total = 1;
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        for (int j = 1; j <= valor; j++) {
            total = total * j;
        }
        JOptionPane.showMessageDialog(null, String.format("O total é: "+ total + "."));
    }
}
