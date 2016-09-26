/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.src.visitor;

/**
 *
 * @author Adrian Tissera
 */
public class Error {
	private int lineNumber;
	private int colNumber;
	private String description;
	
	
	public Error(int ln, int cn, String desc){
		this.lineNumber = ln;
		this.colNumber = cn;
		this.description = desc;
	}
	
}
