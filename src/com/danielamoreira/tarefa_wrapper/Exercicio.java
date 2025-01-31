package com.danielamoreira.tarefa_wrapper;

public class Exercicio {
  public int valor1;
  public Integer valorWrapped;
  public static void main(String[] args) {
    Exercicio exercicio = new Exercicio();

    System.out.println("Digite um número inteiro:");
    exercicio.valor1 = Integer.parseInt(System.console().readLine());

    exercicio.valorWrapped = Integer.valueOf(exercicio.valor1);
    System.out.println("Valor original: " + exercicio.valor1);
    System.out.println("Valor Wrapped: " + exercicio.valorWrapped);
  }
}