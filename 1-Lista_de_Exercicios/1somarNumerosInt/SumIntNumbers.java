package sumIntNumbers;

import java.util.Scanner;

//Objetivo:
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.

public class SumIntNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declarando variaveis que serão usadas
		int val1,val2,soma;
		
		//Perguntando e lendo os inteiros
		System.out.print("Insira o primeiro valor: ");
		val1 = scan.nextInt();
		System.out.print("Insira o segundo valor: ");
		val2 = scan.nextInt();
		
		//Realizando a somatória
		soma = val1 + val2;
		
		//Devolvendo o resultado da operação
		System.out.printf("A soma de %d + %d = %d",val1,val2,soma);
		
		scan.close();
	}

}
