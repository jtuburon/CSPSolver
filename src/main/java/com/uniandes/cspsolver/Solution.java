package com.uniandes.cspsolver;

import java.util.ArrayList;

public class Solution {
	private boolean found=false;
	private ArrayList<Variable> variables;
	private ArrayList<Instruction> instructions;
	
	public Solution() {
		// TODO Auto-generated constructor stub
		found=false;
		variables=new ArrayList<>();
		instructions= new ArrayList<>();
	}
	
	public boolean isFound() {
		return found;
	}
	
	public void setFound(boolean found) {
		this.found = found;
	}
	
	public ArrayList<Variable> getVariables() {
		return variables;
	}
	
	public void setVariables(ArrayList<Variable> variables) {
		this.variables = variables;
	}
	
	public ArrayList<Instruction> getInstructions() {
		return instructions;
	}
	
	public void setInstructions(ArrayList<Instruction> instructions) {
		this.instructions = instructions;
	}
	
	public void addInstruction(Instruction i){
		instructions.add(i);
	}
	
	@Override
	public String toString() {
		return variables.toString()+"\n\n"+ instructions.toString();
	}
}
