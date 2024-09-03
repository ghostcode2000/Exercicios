package Exercicios;

import java.util.Scanner;
/*Faça um algoritmo qu,e receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.*/
public class AntecessorSucessor {

	public static void main(String[] args) {

	int  A;
	int Sucessor;
	int Antecessor;
	
	System.out.println("Digire um valor: ");
	Scanner Leitor = new Scanner(System.in) ;
	A = Leitor.nextInt();

    Sucessor = A + 1;
    Antecessor = A - 1;
    
    System.out.println("O sucessor do numero foi: "+Sucessor+" O antecessor do numero foi: "+Antecessor);
	
	
	}

}
