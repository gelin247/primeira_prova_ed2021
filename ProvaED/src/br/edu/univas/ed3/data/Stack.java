package br.edu.univas.ed3.data;

import br.edu.univas.ed3.Product;
import br.edu.univas.ed3.ProductNode;

public class Stack {
	   
    private ProductNode top = null;

    public void push(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        newNode.next = top;
        top = newNode;
    }

    public Product pop() {
        if(top == null) {
            return null;
        }
        ProductNode node = top;
        top = top.next;
        return node.info;
    }
}


