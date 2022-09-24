package com.mycompany.lista03;
import javax.swing.JOptionPane;

/**
z) [while] Um professor precisa saber qual a média das notas de uma sala e
 * pediu sua ajuda para construir um programa que permita inserir as notas
 * finais de cada aluno e, ao final, exibir a média da sala. Lembre-se que as
 * notas variam de 0 a 10 e o professor digitará -1 quando quiser encerrar as
 * entradas.
 */

public class ex6 {
    public static void main(String[] args) { 
        int total = 0;
        int i = 0;
        double media = 0;
        while(1 != 0) {
            Integer nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota final: "));
            if(nota == -1){
                break;
            }
            if(nota > 10 || nota < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido.");
                break;
            }
            total += nota;
            i ++;
        }
        media = total/i;
        JOptionPane.showMessageDialog(null, String.format("A média é: "+ media + "."));
    }
}
