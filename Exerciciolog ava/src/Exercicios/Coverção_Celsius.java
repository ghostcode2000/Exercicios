package Exercicios;

import java.util.Scanner;

public class Coverção_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leitor = new Scanner(System.in);
		
	float F ;
	float C;
	
     System.out.println("Informe a temperatura em Fahrenheit:");
	F = leitor.nextFloat();
	
	C = (5 * ( F-32) / 9);
	 
	System.out.printf("A temperatura em grau Fahrenheit: "+F+" A temperatura convertida para grau Celsius: %.2f ",C);
	 
	}

}
