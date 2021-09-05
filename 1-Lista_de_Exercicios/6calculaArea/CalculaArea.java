package calculaArea;

import java.util.Scanner;

//Objetivo:
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class CalculaArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Definindo variaveis
		Double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		
		//Perguntando e lendo valores
		System.out.print("Insira o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = scan.nextDouble();
		
		//Calculando areas
		triangulo = a * c / 2.0;
		circulo = 3.14159 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		//Mostrando resultado
		System.out.printf("\nArea do Triangulo: %.3f\n" +
							"Area do Circulo: %.3f\n" +
							"Area do Trapezio: %.3f\n" +
							"Area do Quadrado: %.3f\n" +
							"Area do Retangulo: %.3f\n",triangulo,circulo,trapezio,quadrado,retangulo);
		
		scan.close();
	}

}
