package com.uniandes.cspsolver;

import java.util.List;

public class Variable {
	private String group;
	private String name;
	private String alias;
	
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
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
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
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	@Override
	public String toString() {
		return name+"("+ alias +")" + " = " + value;
	}
}
