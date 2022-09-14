/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cotacaodolar;

import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class CotacaoDolar {

    public static void main(String[] args) {
        Double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar: "));
        Double dolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares: "));
        double real = Math.rint(dolares/cotacao);
        JOptionPane.showMessageDialog(null, "A conversão para real é: R$" + real);
    }
}
