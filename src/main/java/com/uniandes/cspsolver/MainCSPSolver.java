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
	private List<SingleClue> clues;
	
	private KieSession kSession;
	
	public MainCSPSolver(){
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newKieSession("ksession-rules");
		variables = new ArrayList<Variable>();
		clues = new ArrayList<SingleClue>();
		
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
	
	public List<SingleClue> getClues() {
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

	public void addClue(SingleClue c) {
		clues.add(c);
	}
	
	public void addVariable(Variable v) {
		variables.add(v);
	}
	
	public void initFacts(){
		for (Iterator iterator = variables.iterator(); iterator.hasNext();) {
			Variable v = (Variable) iterator.next();
			kSession.insert(v);
		}
		for (Iterator iterator = clues.iterator(); iterator.hasNext();) {
			SingleClue clue = (SingleClue) iterator.next();
			kSession.insert(clue);
		}
	}
}
