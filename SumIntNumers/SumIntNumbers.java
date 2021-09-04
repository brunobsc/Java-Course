package sumIntNumbers;

import java.util.Scanner;

//Objetivo:
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.

public class SumIntNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Perguntando e lendo os inteiros
		System.out.print("Insira o primeiro valor: ");
		int val1 = scan.nextInt();
		System.out.print("Insira o segundo valor: ");
		int val2 = scan.nextInt();
		
		//Realizando a somatória
		int soma = val1 + val2;
		
		//Devolvendo o resultado da operação
		System.out.printf("A soma de %d + %d = %d",val1,val2,soma);
		
		scan.close();
	}

}
