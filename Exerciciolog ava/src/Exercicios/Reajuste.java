package Exercicios;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* F,aça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%. */

	int	valor;
	double resultado;
	double porcentagem = 5;
	
	System.out.println("Digite um valor: ");
	Scanner scanner = new Scanner(System.in);
	valor = scanner.nextInt();
	
	resultado = valor * porcentagem / 100 ;
	int total =(int) (resultado + valor);
	
	System.out.println("O valor do reajuste com 5% = "+total);
	
	
	
		
	}

}
