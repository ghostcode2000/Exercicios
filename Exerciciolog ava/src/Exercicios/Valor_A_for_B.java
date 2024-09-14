package Exercicios;

import java.util.Scanner;

public class Valor_A_for_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	int A,B;
	
	Scanner leitor = new  Scanner(System.in);
		
	System.out.println("Digite o valor de A:");	
	A = leitor.nextInt();
	
	System.out.println("Digite o valor de B:");
	B = leitor.nextInt();
	
	System.out.println("valores antes da troca: A = "+A+", B ="+B );
	
	int temp = A;
	
	A = B;
	
	B = temp;
	
	System.out.println("Valores após a troca : A = "+A+" B = "+B);
	
	
	
	
	
	
	}

}
