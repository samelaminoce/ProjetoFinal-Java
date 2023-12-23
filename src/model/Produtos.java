package model;

import util.Utils;

public class Produtos {

	private static int count = 1;
	
	private int id;
	private String nome;
	private double preco;
	public Produtos(String nome, double preco) {
		super();
		this.id = count;
		this.nome = nome;
		this.preco = preco;
		Produtos.count += 1;
	}
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String toString() {
		double value;
		return "Id: " + this.getId() + "\nNome: " + this.getNome()+
				"\nPreço" + Utils.doubleToString( this.getPreco());
	}
}
