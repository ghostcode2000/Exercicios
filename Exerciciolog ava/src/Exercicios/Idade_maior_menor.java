package Exercicios;

import java.util.Scanner;

public class Idade_maior_menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 
		
		String Nome;
		int idade;
		int  maioridade = 18;
		Scanner leitor = new  Scanner(System.in);
		
		System.out.println("Infome seu nome:");
		Nome = leitor.next();
		System.out.println("Infome sua idade:");
		idade = leitor.nextInt();
		
		if (idade >= maioridade ) {
		System.out.println(Nome+" vc é maior de idade. ");	
		}else if (idade < maioridade) {
			System.out.println(Nome+" vc é menor de idade.");
		}
		
	}

}
