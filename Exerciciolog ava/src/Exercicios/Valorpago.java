package Exercicios;

import java.util.Scanner;

public class Valorpago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double valorProduto;
	
	Scanner scanner = new  Scanner(System.in);
	
	System.out.println("Informe 0 valor do produto: ");
	valorProduto = scanner.nextDouble();
	
	System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto) ");
    System.out.println("2 - À Vista no Cartão de Crédito (10% de desconto) ");
    System.out.println("3 - Parcelado em 2x no Cartão (Sem juros) ");
    System.out.println("4 - Parcelado em 3x ou mais no Cartão (10% de juros) ");
	
	
	
	 // Solicita o código da forma de pagamento
	System.out.println("Digite o digito da opção do pagamento:");
	int digitoPagamento = scanner.nextInt();
	
	double totalCompra;
	
	  // Condições de pagamento
	switch (digitoPagamento) {
	
	case 1:
	
		totalCompra = valorProduto * 0.85 ;
		System.out.println("Forma de pagamento pix:valor com 15% desconto");
		break;
	
	case 2:
		
		totalCompra = valorProduto * 0.90;
		System.out.println("Forma de pagamento Cartão de Credito (10% de desconto)");
		break;
	
	case 3:
		
		totalCompra = valorProduto;
		System.out.println("Forma de pagamento Parcelado 2x :Sem juros");
		break;
		
	case 4:
		
		totalCompra = valorProduto * 1.10;
		System.out.println("Forma de pagameto parcelado 3x: 10% juros");
		break;
	default:
		System.out.println("Código invalido.");
		return;
	              } 
	   // Exibe o valor final da compra formatado
		System.out.printf("Valor final a ser pago: R$ %.2f\n" ,totalCompra );
	
scanner.close();
		
		
		
		
	


}
}