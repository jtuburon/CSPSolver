package com.uniandes.cspsolver;

import java.util.ArrayList;

public class AllDiffClue extends Clue{
	private ArrayList<String> variables;
	
	public AllDiffClue() {
		// TODO Auto-generated constructor stub
		variables= new ArrayList<>();
	}
	public ArrayList<String> getVariables() {
		return variables;
	}
	public void setVariables(ArrayList<String> variables) {
		this.variables = variables;
	}
	
	public void addVariable(String varName){
		variables.add(varName);
	}
	
	@Override
	public String toString() {
		return "ALLDIFF"+variables.toString();
	}
}
