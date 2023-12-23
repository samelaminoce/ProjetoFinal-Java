package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import conta.util.Cores;
import model.Produtos;

public class Loja {


	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produtos> itens;
	private static int carrinho;
	
	public static void main(String[] args) {
		itens = new ArrayList<>();
		carrinho = hashMap();
		menu();
		
	}
	private static int hashMap() {
		// TODO Auto-generated method stub
		return 0;
	}
	private static void menu() {
		System.out.println(util.Cores.TEXT_Yellow + util.Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                Ateliê Look Perfeito                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Cadastrar                           ");
		System.out.println("            2 - Catálogo                            ");
		System.out.println("            3 - Comprar                               ");
		System.out.println("            4 - Carrinho                              ");
		System.out.println("            5 - Sair                                  ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
	}
	int option = input.nextInt();{
	
	
	switch(option) {
	case 1:
		comprarItens();
		break;
		
	case 2:
		comprarItens();
         break;
		
	case 3:
		comprarItens();
		break;
	case 4:
		verCarrinho();
         break;
	case 5:
		System.out.println("Até Logo");
         break;
   
		default:
			System.out.println("Opçõa Inválida");
			menu();
			break;
	}
	
}


	private void verCarrinho() {
		// TODO Auto-generated method stub
		
	}
	private void comprarItens() {
		// TODO Auto-generated method stub
		
	}
}
