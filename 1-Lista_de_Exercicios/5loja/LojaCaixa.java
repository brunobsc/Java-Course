package loja;

import java.util.Scanner;

//Objetivo:
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class LojaCaixa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declarando variaveis
		int codigo1,qtd1,codigo2,qtd2;
		double valorUnitario1,valorUnitario2,valorTotal;
		
		//Pedindo e recebendos dados do primeiro produto
		System.out.println("Primeiro produto");
		System.out.print("Insira o código do produto: ");
		codigo1 = scan.nextInt();
		System.out.print("Insira a quatidade: ");
		qtd1 = scan.nextInt();
		System.out.print("Insira o valor unitário do produto: ");
		valorUnitario1 = scan.nextDouble(); 
		
		//Pedindo e recebendos dados do segundo produto
		System.out.println("\nSegundo produto");
		System.out.print("Insira o código do produto: ");
		codigo2 = scan.nextInt();
		System.out.print("Insira a quatidade: ");
		qtd2 = scan.nextInt();
		System.out.print("Insira o valor unitário do produto: ");
		valorUnitario2 = scan.nextDouble();
		
		//Calculando o valor total
		valorTotal = (qtd1 * valorUnitario1) + (qtd2 * valorUnitario2);
		
		//Mostrando o valor final
		System.out.printf("\nValor a pagar: R$ %.2f",valorTotal);
		
		scan.close();
	}

}
