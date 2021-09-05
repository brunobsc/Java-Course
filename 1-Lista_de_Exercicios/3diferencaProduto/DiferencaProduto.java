package diffProduct;

import java.util.Scanner;

//Objetivo:
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declarando variaveis
		int a,b,c,d,diff;
		
		//Pedido e recebendo valores de a,b,c e d
		System.out.print("Insira o valor de A: ");
		a = scan.nextInt();
		System.out.print("Insira o valor de B: ");
		b = scan.nextInt();
		System.out.print("Insira o valor de C: ");
		c = scan.nextInt();
		System.out.print("Insira o valor de D: ");
		d = scan.nextInt();
		
		//Calculado a diferença senguindo a fórmula [ DIFERENCA = (A * B - C * D) ]
		diff = a * b - c * d;
		
		//Mostrando o Resultado
		System.out.printf("Diferença = %d",diff);
		
		scan.close();
	}

}
