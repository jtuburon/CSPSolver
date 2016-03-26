package com.uniandes.cspsolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class InValuesClue extends Clue{
	private String dstVar;
	
	private ArrayList<Integer> values;
	
	public InValuesClue() {
		// TODO Auto-generated constructor stub
		values = new ArrayList<>();
	}
	
	public String getDstVar() {
		return dstVar;
	}
	
	public void setDstVar(String dstVar) {
		this.dstVar = dstVar;
	}
	
	public ArrayList<Integer> getValues() {
		return values;
	}
	
	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}
	
	public void addValue(Integer value){
		values.add(value);
		
	}
	
	@Override
	public String toString() {
		return dstVar+" IN " + values.toString();
	}
	
}
