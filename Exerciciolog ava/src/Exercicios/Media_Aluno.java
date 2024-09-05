package Exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class Media_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double n1,n2,n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		n1 = scanner.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = scanner.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = scanner.nextDouble();
		
		Double media = (n1+n2+n3)/3;
		
		System.out.println("A média do aluno = "+media);
	}

	
	}


