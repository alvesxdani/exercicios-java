package com.danielamoreira.tarefa_calculo_media;

public class CalculoMedia {
  public double nota1;
  public double nota2;
  public double nota3;
  public double nota4;
  public double media;
  public static void main(String[] args) {
    CalculoMedia calculoMedia = new CalculoMedia();

    System.out.println("Calculo da média de notas:");
    System.out.println("Digite a primeira nota:");
    calculoMedia.nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a segunda nota:");
    calculoMedia.nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a terceira nota:");
    calculoMedia.nota3 = Double.parseDouble(System.console().readLine());
    System.out.println("Digite a quarta nota:");
    calculoMedia.nota4 = Double.parseDouble(System.console().readLine());
    
    calculoMedia.media = (calculoMedia.nota1 + calculoMedia.nota2 + calculoMedia.nota3 + calculoMedia.nota4) / 4;
    System.out.println("A média das notas é: " + calculoMedia.media);
  }
}
