/*
 * Taller de Diseño de software 2016
 * 
 * Proyecto: C-TDS compiler
 * 
 * Autor: Adrian Tissera
 * 
 */
package main.src.visitor;

/**
 *
 * @author Adrian Tissera
 */

public class SymbolTable {
	
	private final int SIZE = 256;
	private Bucket table[] = new Bucket[SIZE];
	
	private int hash(String s) {
		int h = 0;
		for (int i = 0; i < s.length(); i++)
			h = h * 65599 + s.charAt(i);
		return h;
	}
	
	public void put(String s, Object b) {
		int index = hash(s)%SIZE;
		table[index] = new Bucket(s, b, table[index]);
	}
	
	public Object get(String s) {
		int index = hash(s) % SIZE;
		for (Bucket b = table[index]; b != null; b = b.next)
			if (s.equals(b.key)) return b.binding;
		return null;
	}
	
	public void remove(String s) {
		int index = hash(s) % SIZE;
		table[index]=table[index].next;
	}
}

class Bucket {
	String key; 
	Object binding; 
	Bucket next;
	
	Bucket(String k, Object b, Bucket n) {
		key = k; 
		binding = b; 
		next= n;
	}
}