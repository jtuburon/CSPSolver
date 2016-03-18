package com.uniandes.cspsolver;

public class Clue {
	private String prefix;
	private String relationship;
	private String suffix;
	
	public Clue() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	public String getRelationship() {
		return relationship;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	@Override
	public String toString() {
		return prefix +relationship +suffix;
	}
	
	
}
