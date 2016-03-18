package com.uniandes.cspsolver;

import java.util.List;

public class Variable {
	private String name;
	private int value;
	//private List<Integer> domain;
	
	public Variable() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	/*
	public List<Integer> getDomain() {
		return domain;
	}
	
	public void setDomain(List<Integer> domain) {
		this.domain = domain;
	}
	
	private void addValue(Integer i){
		domain.add(i);
	}
	
	public void removeValue(Integer i){
		domain.remove(i);	
	}
	
	public void removeValue(int index){
		domain.remove(index);	
	}
	*/
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return name+ "=" + value;
	}
}
