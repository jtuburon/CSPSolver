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
		SingleClue c= new SingleClue();
		c.setDstVar("A1");
		c.setRelationship("=");
		c.setValue("2");
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
