package com.uniandes.cspsolver;

import java.util.ArrayList;

public class Instruction {
	private String ruleName;
	private String ruleDescription;
	private ArrayList<String> actions;
	
	public Instruction() {
		actions= new ArrayList<>();
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleDescription() {
		return ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}
	
	public ArrayList<String> getActions() {
		return actions;
	}

	public void setActions(ArrayList<String> actions) {
		this.actions = actions;
	}
	
	public void addAction(String action){
		actions.add(action);
	}
	
	@Override
	public String toString() {
		String text= "\n\nRuleName: "+ruleName;
		text+= "\nDescription: "+ruleDescription;
		text+= "\nActions: ";
		for(int i= 0; i< actions.size();i++){
			text+="\n\t" + actions.get(i);
		}
		return text;
	}
}
