package br.edu.univas.ed3;

public class Product {// n� (node)

	// informa��es do n�
	public String name;
	public int amount;

	// retorna uma String correspondente a um objeto. Usado para debug.
	public String toString() {
		return "Product: " + name + " (" + amount + ")";
	}
}