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
public class ex8 {
    public static void main(String[] args) {
        Double base1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do primeiro triângulo: "));
        Double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do primeiro triângulo: "));
        Double base2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do segundo triângulo: "));
        Double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do segundo triângulo: "));
        Double base3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do terceiro triângulo: "));
        Double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do terceiro triângulo: "));
        double triangulo1 = base1 * altura1 / 2;
        double triangulo2 = base2 * altura2 / 2;
        double triangulo3 = base3 * altura3 / 2;
        double maior;
        if(triangulo1 > triangulo2){
            maior = triangulo1;
        }
        else {
            maior = triangulo2;
        }
        
        if(triangulo3 > maior) {
            maior = triangulo3;
        }
       
        JOptionPane.showMessageDialog(null, String.format("O maior triangulo tem a área de: "+ maior));
    }
}
