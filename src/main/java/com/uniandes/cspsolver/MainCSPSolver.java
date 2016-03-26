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
		this.initCSP01();
		//this.initCSPTest();
	}
	
	private void initCSP01(){
		SingleClue c1= new SingleClue();
		c1.setDstVar("A1");
		c1.setRelationship(">");
		c1.setValue(6);
		clues.add(c1);
		
		TwoVarsRelationshipClue tvc= new TwoVarsRelationshipClue();
		tvc.setDstVar("A3");
		tvc.setRelationship("=");
		tvc.setSrcVar("A2");
		tvc.setOperator("+");
		tvc.setValue(1);
		clues.add(tvc);
		
		SingleClue c= new SingleClue();
		c.setDstVar("B2");
		c.setRelationship("=");
		c.setValue(6);
		clues.add(c);
		
		tvc= new TwoVarsRelationshipClue();
		tvc.setDstVar("B1");
		tvc.setRelationship("=");
		tvc.setSrcVar("A4");
		tvc.setOperator("+");
		tvc.setValue(1);
		clues.add(tvc);
		
		c= new SingleClue();
		c.setDstVar("B3");
		c.setRelationship("=");
		c.setValue(5);
		clues.add(c);
		
	}
	
	private void initCSP02(){
		Clue c= InputPattern.parseStringToClue("A2=A3+1000");
		clues.add(c);
		c= InputPattern.parseStringToClue("A2=B3+0");
		clues.add(c);
		c= InputPattern.parseStringToClue("A1=B2+1000");
		clues.add(c);
		c= InputPattern.parseStringToClue("B4=9000 XOR B4=A3+0");
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
