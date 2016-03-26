package com.uniandes.cspsolver;

public class XORClue extends Clue{
	private SingleClue c1;
	private SingleClue c2;
	
	public XORClue() {
		// TODO Auto-generated constructor stub
	}
	
	public SingleClue getC1() {
		return c1;
	}
	public void setC1(SingleClue c1) {
		this.c1 = c1;
	}
	
	public SingleClue getC2() {
		return c2;
	}
	public void setC2(SingleClue c2) {
		this.c2 = c2;
	}
	
	@Override
	public String toString() {
		return c1.toString() + " " + InputPattern.XOR_OPERATOR + " " +c2.toString();
	}
}
