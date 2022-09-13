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
public class exe8 {
    public static void main(String[] args) {
        Double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida(em Km): "));
        Double gasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite a gasolina gasta(em Litros) por Km: "));
        double total = Math.rint(distancia / gasolina);

        JOptionPane.showMessageDialog(null, "O carro gastou " + total + " Litros");
    }
}
