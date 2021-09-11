package positivoouNegativo;

import java.util.Scanner;

//Objetivo:
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou positivo.

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Pergunta e recebe um valor inteiro
		System.out.print("Insira um valor para saber se é Positivo ou Negativo: ");
		int num = scan.nextInt();
		
		//Verifica se é maior que zero, menor que zero ou caso contrario é neutro (ou seja, zero)
		//Obs: Linha unica dentro da condição não precisa de { }
		if (num > 0)
			System.out.printf("%d é Positivo.",num); 
		else if (num < 0 )
			System.out.printf("%d é Negativo.",num);
		else
			System.out.printf("%d é Neutro", num);
		
		scan.close();
	}
}
