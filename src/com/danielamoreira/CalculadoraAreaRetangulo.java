package com.danielamoreira;

public class CalculadoraAreaRetangulo {
    double largura = 5.0;
    double altura = 3.0;

    void calcularArea() {
        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }

    void main() {
        calcularArea();
    }
}
