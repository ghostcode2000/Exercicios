package Exercicios;

import java.util.Scanner;

public class TempoVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	Scanner scanner = new  Scanner(System.in);
	
	System.out.println("Informe o ano atual:");
	int AnoAtual = scanner.nextInt();
	
	System.out.println("Infome o ano do seu nacismento");
	int AnoNascimento = scanner.nextInt();
	
	System.out.println("Informe mes atual: ");
	int MesAtual = scanner.nextInt();
	
	System.out.println("Informe mes de nacimento");
	int mes = scanner.nextInt();
	
	System.out.println("Informe o dia atual");
	int diaAtual = scanner.nextInt();
	System.out.println("Informe o dia do nascimento:");
	int dia = scanner.nextInt();
	
	int AnosVividos = AnoAtual - AnoNascimento;
	int mesesVividos = mes - MesAtual;
	int diasVividos = dia - diaAtual;
	
	if (diasVividos <0) {
		diasVividos +=30;
		mesesVividos--;
	}
	
	if (mesesVividos < 0) {
		mesesVividos += 12;
		AnosVividos--;
		
	}
	
	System.out.println("Vc ja viveu "+AnosVividos+" anos, meses: "+mesesVividos+" e dias: "+diasVividos);

	
	scanner.close();
	}

}
