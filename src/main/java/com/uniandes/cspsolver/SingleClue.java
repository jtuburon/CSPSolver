package com.uniandes.cspsolver;

public class SingleClue {
	private String dstVar;
	private String relationship;
	private int value;
	
	public SingleClue() {
		// TODO Auto-generated constructor stub
	}

	public String getDstVar() {
		return dstVar;
	}
	
	public void setDstVar(String dstVar) {
		this.dstVar = dstVar;
	}
	
	
	public String getRelationship() {
		return relationship;
	}
	
	
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return dstVar +relationship + value;
	}
	
	
}
