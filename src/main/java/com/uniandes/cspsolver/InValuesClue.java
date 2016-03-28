package com.uniandes.cspsolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class InValuesClue extends Clue{
	private String dstVar;
	private boolean notIn=false;
	
	private ArrayList<Integer> values;
	
	public InValuesClue() {
		notIn=false;
		values = new ArrayList<>();
	}
	public boolean isNotIn() {
		return notIn;
	}
	
	public void setNotIn(boolean notIn) {
		this.notIn = notIn;
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
		if(notIn){
			return dstVar+" NOT_IN " + values.toString();
		}else{
			return dstVar+" IN " + values.toString();
		}
		
	}
	
}
