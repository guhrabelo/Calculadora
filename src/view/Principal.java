package view;

import java.util.Scanner;

import controller.NPRController;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		NPRController calc = new NPRController();
		PilhaInt pilha = new PilhaInt();
		int opcao = 0;
		
		do {
			if(opcao == 1 || opcao == 2) {
				System.out.println("O valor do topo pilha atual é: " + pilha.top());
				System.out.println("");
			}
			
			System.out.println("Selecione uma das opções:");
			System.out.println("1 - Adicione um número a pilha"
						+ "\n2 - Realizar uma operação"
						+ "\n3 - sair");
			opcao = scan.nextInt();
			if(opcao == 1) {
				System.out.println("Informe o número: ");
				calc.insereValor(pilha, scan.nextInt()); 
			}else if(opcao == 2) {
				System.out.println("Informe a operação: ");
				try {
					String operacao = scan.next();
					pilha.push(calc.npr(pilha, operacao));
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}	
		}while(opcao != 3);
		
		scan.close();
	}

}
