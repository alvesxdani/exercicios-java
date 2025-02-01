package com.danielamoreira.tarefa_controle_de_fluxo;

public class ControleDeFluxo {
  public double nota1;
  public double nota2;
  public double nota3;
  public double nota4;
  public double media;

  public static void main(String[] args) {
    ControleDeFluxo controle = new ControleDeFluxo();
    System.out.println("Digite a primeira nota:");
    controle.nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a segunda nota:");
    controle.nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a terceira nota:");
    controle.nota3 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a quarta nota:");
    controle.nota4 = Double.parseDouble(System.console().readLine());

    boolean hasNota1 = controle.nota1 >= 0;
    boolean hasNota2 = controle.nota1 >= 0;
    boolean hasNota3 = controle.nota1 >= 0;
    boolean hasNota4 = controle.nota1 >= 0;

    if (hasNota1 && hasNota2 && hasNota3 && hasNota4) {
      controle.media = (controle.nota1 + controle.nota2 + controle.nota3 + controle.nota4) / 4;

      if (controle.media >= 7) {
        System.out.println("Aprovado! Média: " + controle.media);
      } else if (controle.media >= 5) {
        System.out.println("Recuperação! Média: " + controle.media);
      } else {
        System.out.println("Reprovado! Média: " + controle.media);
      }
    } else {
      System.out.println("Digite um valor válido para as notas.");
    }
  }
}