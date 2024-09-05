package Exercicios;

import java.util.Scanner;

public class Calculo_IMC {
	public static void main(String[] args) {
		
		//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, 
		//leia o seu peso e sua altura e imprima na tela sua condição 
		
		Scanner scanner = new Scanner(System.in);
		double  altura;
		double peso;
		
		System.out.println("Informe sua altura : ");
		altura = scanner.nextDouble();
		
		System.out.println("Iforme seu peso: ");
		peso = scanner.nextDouble();
		
		double IMC = peso / (altura*altura);
		
		System.out.println("Seu IMC foi : "+IMC);
		
		if (IMC < 18.5) {
			System.out.println("Vc está Abaixo do peso.");			
		}
			if (IMC > 18.5 && IMC <=24.9 ) {
				System.out.println("Vc está no peso ideal. ");				
			}
				if (IMC >= 25.0 && IMC <= 29.9) {
					System.out.println("Vc está levemente acima do peso");
				}
					
					if (IMC >= 30. && IMC <= 34.9 ) {
						System.out.println(" Obesidade  grau 1 ");
				 }
						if	(IMC >= 35.0 && IMC <= 39.9) {
							System.out.println(" Obesidade grau II (severa)");
						}
							if (IMC >= 40) {
								System.out.println("Obesidade grau III (mórbida)");
							}
		scanner.close();
		
	
	}
}
