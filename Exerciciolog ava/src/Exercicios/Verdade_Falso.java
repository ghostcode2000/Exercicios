package Exercicios;

import java.util.Scanner;

public class Verdade_Falso {

	public static void main(String[] args) {
	/*Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.*/

	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	boolean valor1 = scanner.nextBoolean();
	
	System.out.println("Digite o segundo valor: ");
	boolean valor2 = scanner.nextBoolean();
	
	if ( valor1 && valor2 ) {	
		System.out.println("Os dois valores são verdadeiros ");		
	} else if (!valor1 && !valor2 ) {
		System.out.println("Os dois valores são falso");
	} else {
		System.out.println("Os dois valores são diferentes. ");
	}
	
	
		scanner.close();
		
	}

}
