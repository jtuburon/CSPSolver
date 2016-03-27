package com.uniandes.cspsolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class MainCSPSolver 
{
	private List<Variable> variables;
	private List<Clue> clues;
	
	private KieSession kSession;
	
	public MainCSPSolver(){
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newKieSession("ksession-rules");
		variables = new ArrayList<Variable>();
		clues = new ArrayList<Clue>();
		//this.initCSP01();
		this.initCSP02();
		//this.initCSPTest();
	}
	
	private void initCSP01(){
		Clue c= InputPattern.parseStringToClue("A1>6");
		clues.add(c);
		c= InputPattern.parseStringToClue("A3=A2+1");
		clues.add(c);
		c= InputPattern.parseStringToClue("B2=6");
		clues.add(c);
		c= InputPattern.parseStringToClue("B1=A4+1");
		clues.add(c);
		c= InputPattern.parseStringToClue("B3=5");
		clues.add(c);
	}
	
	private void initCSP02(){
		Clue c= InputPattern.parseStringToClue("A1=B1+0");
		clues.add(c);
		c= InputPattern.parseStringToClue("A3=2 XOR B3=2");
		clues.add(c);
		c= InputPattern.parseStringToClue("A3>B2+0");
		clues.add(c);
		c= InputPattern.parseStringToClue("B4=3");
		clues.add(c);
		c= InputPattern.parseStringToClue("B3>A4+0");
		clues.add(c);
	}
	
	private void initCSPTest(){
		SingleClue c= new SingleClue();
		c.setDstVar("A1");
		c.setRelationship("<=");
		c.setValue(2);
		clues.add(c);
	}
	
	public List<Clue> getClues() {
		return clues;
	}
	
	public List<Variable> getVariables() {
		return variables;
	}

	public void solve(){
		try{
			kSession.fireAllRules();
		}catch (Throwable t){
			t.printStackTrace();
		}finally{
			kSession.dispose ();
		}
	}

	public void addClue(Clue c) {
		clues.add(c);
	}
	
	public void addVariable(Variable v) {
		variables.add(v);
	}
	
	public void initFacts(){
		for (int i=0; i< variables.size();i++) {
			Variable v = variables.get(i);
			kSession.insert(v);
		}
		for (int i=0; i< clues.size();i++) {
			Clue clue = clues.get(i);
			kSession.insert(clue);
		}
	}
}
