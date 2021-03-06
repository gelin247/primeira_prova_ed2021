package br.edu.univas.ed3;

public class StackChar {
	 private CharNode top = null;

	    public void push(Character character) {
	        CharNode newNode = new CharNode();
	        newNode.info = character;
	        newNode.next = top;
	        top = newNode;
	    }

	    public Character pop() {
	        if(top == null) {
	            return null;
	        }
	        CharNode node = top;
	        top = top.next;
	        return node.info;
	    }

	    public String getAsString() { //concatena de cima para baixo
	        StringBuffer buffer = new StringBuffer();
	        CharNode current = top;

	        while(current != null) {
	            buffer.append(current.info + ":");
	            current = current.next;
	        }
	        return buffer.toString();
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void clear() {
	        this.top = null;
	    }
	}


