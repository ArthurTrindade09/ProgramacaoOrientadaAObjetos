// -----------------------------------
// POO.
// Progama de receber dados e printar.
// -----------------------------------

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, rua, numero, bairro, complemento,
			cep, cidade, uf, cpf, data, idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o nome de sua rua: ");
		rua = sc.nextLine();
		
		System.out.println("Digite o número da casa: ");
		numero = sc.nextLine();
		
		System.out.println("Digite o nome de seu bairro: ");
		bairro = sc.nextLine();
		
		System.out.println("Digite seu complemento: ");
		complemento = sc.nextLine();
		
		System.out.println("Digite seu cep: ");
		cep = sc.nextLine();
		
		System.out.println("Digite o nome de sua cidade: ");
		cidade = sc.nextLine();
		
		System.out.println("Digite o uf: ");
		uf = sc.nextLine();
		
		System.out.println("Digite seu cpf: ");
		cpf = sc.nextLine();
		
		System.out.println("Digite sua data de nascimento: ");
		data = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextLine();
		
		sc.close();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + complemento + ", " + cep + ", " + cidade + ", " + uf);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de Nascimento: " + data);
		System.out.println("Idade: " + idade);
	}
}
