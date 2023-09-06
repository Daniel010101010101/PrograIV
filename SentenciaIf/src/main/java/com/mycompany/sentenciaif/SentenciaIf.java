/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciaif;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class SentenciaIf {

    public static void main(String[] args) {
        //menor de 3 numeros a, b y c
        float a, b, c, menor;
        String primerNumero, segundoNumero, tercerNumero;
        //Leer los valores de a, b, y c
        primerNumero = JOptionPane.showInputDialog("Digite el primer número: " );
        segundoNumero = JOptionPane.showInputDialog("Digite el segundo número: " );
        tercerNumero = JOptionPane.showInputDialog("Digite el tercer número: " );
        a = Float.parseFloat(primerNumero);
        b = Float.parseFloat(segundoNumero);
        c = Float.parseFloat(tercerNumero);
        if (a < b){
        if (a < c)
        menor = a;
        else
        menor = c;
        }
        else{
            if (b > c)
            menor = b;
            else
                menor = c;
        }
        JOptionPane.showMessageDialog(null, "El valor menor es: " + menor);
        System.out.println("Menor:"+menor);
    }
}
