package com.danielamoreira.tarefa_classes;

/**
 * Classe que representa um carro.
 * 
 * Atributos:
 * <ul>
 * <li>marca: String
 * <li>modelo: String</li>
 * <li>ano: int</li>
 * <li>cor: String</li>
 * <li>velocidadeAtual: int</li>
 * <li>velocidadeMaxima: int</li>
 *  <li>combustivel: String</li>
 * </ul>
 * @author Daniela Moreira
 * @since 1.0
 * @version 1.0
 */

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String marca, String modelo, int ano, String cor, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int velocidade) {
        if (velocidadeAtual + velocidade > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        } else {
            velocidadeAtual += velocidade;
        }
    }

    public void frear(int velocidade) {
        if (velocidadeAtual - velocidade < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= velocidade;
        }
    }

    public void parar() {
        velocidadeAtual = 0;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
