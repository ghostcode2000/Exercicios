package Exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class Media_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double n1,n2,n3,n4;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		String nome = scanner.next();		
		
		System.out.println("Informe a primeira nota: ");
		n1 = scanner.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = scanner.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = scanner.nextDouble();
		System.out.println("Informe a quarta nota: ");
		n4 = scanner.nextDouble();
		
		Double media = (n1+n2+n3+n4)/4;
		
		System.out.println("Anulo : "+nome);
		System.out.printf("A media do aluno foi %.2f\\n: ",media);
		
		if (media >= 7) { 
			System.out.println("Aluno está aprovado.");	
		}else {
			System.out.println("Aluno está reprovado");
		}
		
		
		scanner.close();
		
	}
}

