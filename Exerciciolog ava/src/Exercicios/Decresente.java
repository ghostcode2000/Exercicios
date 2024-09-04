package Exercicios;

import java.util.Scanner;

public class Decresente {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.*/
 
     int valor1,valor2,valor3; 
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Digite o primeiro valor: ");
     valor1 = scanner.nextInt();
     
     System.out.println("Digite o segundo valor: ");
     valor2 = scanner.nextInt(); 
		
     System.out.println("Digite o terceiro valor: ");
     valor3 = scanner.nextInt();	
     
     int maior,meio,menor;
     
     if ( valor1 > valor2 && valor1 > valor3 ) {
    	maior = valor1 ;
     }if(valor2 > valor3) {
    	 meio = valor2;
    	 menor = valor3;
     }else {
    	 meio = valor3;
    	 menor = valor2;
     }
       if (valor2 > valor1 && valor2 > valor3) {
    	   maior = valor2;
       }if
       
	}

}
