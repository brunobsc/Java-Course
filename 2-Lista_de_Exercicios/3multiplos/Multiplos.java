package multiplos;

import java.util.Scanner;

//Objetivo:
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
//Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

public class Multiplos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Define variaveis usadas
		int a,b;
		
		//Pergunta e recebe o valor de A e B
		System.out.print("Insira o Valor de A: ");
		a = scan.nextInt();
		System.out.print("Insira o Valor de B: ");
		b = scan.nextInt();
		
		//Verifica se o resultado do mod (Resto da divisão) de A por B ou B por A é zero, se sim, são multiplos;
		if (a % b == 0 || b % a == 0)
			System.out.print("São Multiplos");
		else
			System.out.print("Não são Multiplos");

		scan.close();
	}

}
