package parOuImpar;

import java.util.Scanner;

//Objetivo:
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Pergunta e recebe um valor
		System.out.print("Insira um valor para saber se é Par ou Ímpar: ");
		int num = scan.nextInt();
		
		//Utiliza o mod (Resto da divisão) por 2, caso seja zero é par, do contrario, ímpar.
		if (num % 2 == 0)
			System.out.print("Par");
		else
			System.out.print("Impar");
		
		scan.close();
	}

}
