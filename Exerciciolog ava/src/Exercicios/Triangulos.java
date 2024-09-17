package Exercicios;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é 

         equilátero, isósceles ou escaleno.*/
		
		int A1,A2,A3; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro angulo do triangolo: ");
		A1 = leitor.nextInt();
		
		System.out.println("Informe o segundo angulo do triangolo:");
		A2 = leitor.nextInt();
		
		System.out.println("Informe o segundo angulo do triangolo:");
		A3 = leitor.nextInt();
		
		if (A1 == A2 && A2 == A3) {
			System.out.println("Este é um triangulo équilatero.");
		}
			if (A1 == A2 && A1 != A3 && A2 != A3 ) {
				System.out.println("Este é um triango isoceles");
			}
				if (A1 != A2 && A2 != A3) {
					System.out.println("Esté é um triango escaleno.");
				}
		
				leitor.close();
		
		
		
	}

}
