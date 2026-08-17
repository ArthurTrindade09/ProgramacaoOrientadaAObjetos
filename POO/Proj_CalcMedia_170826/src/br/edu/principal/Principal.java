
// --------------------------------------------------
// POO.
// Calculadora de Média que recebe um nome e 2 notas.
// Projeto aula 17/08/26.
// --------------------------------------------------

package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		Double n1, n2, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite sua nota 01: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite sua nota 02: ");
		n2 = sc.nextDouble();
		
		media = (n1+n2)/2;
		
		sc.close();
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
	}

}
