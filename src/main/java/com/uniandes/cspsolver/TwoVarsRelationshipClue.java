package com.uniandes.cspsolver;

public class TwoVarsRelationshipClue extends SingleClue {
	private String srcVar;
	private String operator;
	
	public TwoVarsRelationshipClue() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getSrcVar() {
		return srcVar;
	}
	
	public void setSrcVar(String srcVar) {
		this.srcVar = srcVar;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String toString() {
		return getDstVar() + getRelationship() + getSrcVar()+ getOperator()+ getValue();
	}
}
