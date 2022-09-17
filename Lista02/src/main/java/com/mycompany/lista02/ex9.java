/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class ex9 {
    public static void main(String[] args) {
        Double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira aresta: "));
        Double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda aresta: "));
        Double a3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira aresta: "));
        String tipo_triangulo = "";
        if((a1+a2) < a3 || (a1+a3) < a2 || (a3+a2) < a1) {
            JOptionPane.showMessageDialog(null, String.format("Não é possível formar um triângulo."));
        } 
        else {
            if(!Objects.equals(a1, a2) && !Objects.equals(a1, a3) && !Objects.equals(a2, a3)){
                tipo_triangulo = "escaleno"; 
            } 
            else if(Objects.equals(a1, a2) && Objects.equals(a1, a3) && Objects.equals(a2, a3)) {
                tipo_triangulo = "equilátero"; 
            }
            else {
                tipo_triangulo = "isósceles";
            }
            JOptionPane.showMessageDialog(null, String.format("O tipo do triângulo é: "+ tipo_triangulo));
        }
    }
}
