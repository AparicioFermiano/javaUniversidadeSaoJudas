package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
b) [while] Elabore um programa que recebe valores naturais até que seja
 * digitado o valor zero. O programa deverá exibir a média aritmética.
 * Lembre-se: o valor zero apenas sinaliza o fim da entrada, não deve ser
 * contabilizado.
 */

public class ex2 {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        double media = 0;
        while(1 != 0){
           Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
           if(valor == 0){
               break;
           }
           else{
               i ++;
               total += valor;
           }
           media = total/i;
        }
        JOptionPane.showMessageDialog(null, String.format("A média é: "+ media));
    }
}
