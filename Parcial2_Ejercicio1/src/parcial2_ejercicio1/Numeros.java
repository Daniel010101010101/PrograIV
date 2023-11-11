/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_ejercicio1;

/**
 *
 * @author ASUS
 */
public class Numeros {
    
    private int numero1,numero2,numero3;
    private float numero4,numero5;
    private String caracter;
    
    //Constructor sobrecargado con valores por defecto
    public Numeros()
    {
        this.numero1 = 0;
        this.numero2 = 0;
        this.numero3 = 0;
        this.numero4 = 0;
        this.numero5 = 0;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public float getNumero4() {
        return numero4;
    }

    public void setNumero4(float numero4) {
        this.numero4 = numero4;
    }

    public float getNumero5() {
        return numero5;
    }

    public void setNumero5(float numero5) {
        this.numero5 = numero5;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    

    
    public void Elevar(int numero){
        if (numero > 0) {
            int resultado = numero * numero;
            System.out.println("Resultado: " + resultado );
            
        }
        else{
            System.out.println("Ingrese un valor valido");
        }
    }
    
    public void MultiplicarFlotante(float n1, float n2){
        
        if(n1 > 0 && n2 > 0)
        {
            System.out.println("Resultado: " + n1*n2);
        }
        else
        {
            System.out.println("Ingrese un valor valido");
        }
    }
    
    public void EnteroyCaracter(int n1, int n2, String c){
        System.out.println("Valores ingresados: " + n1 + " " + n2 + " " +c);
    }
    
}
