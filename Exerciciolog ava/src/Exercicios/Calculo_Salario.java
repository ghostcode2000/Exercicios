package Exercicios;

import java.util.Scanner;

public class Calculo_Salario {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
/*5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse 

usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.400).*/
		
		double salmini = 1400;
		double salusuario;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario:");
		salusuario = scanner.nextDouble();
		
		int VezesSal = (int) ( salusuario / salmini);
		
		System.out.println("O usuário recebe: "+VezesSal+" salarios minimos.");
		
		
	}

}
