package com.uniandes.cspsolver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClueUtils {
	
	
	public static SingleClue parseStringToClue(String clueAsString){
		SingleClue c=null;
		if(clueAsString.matches(InputPattern.SINGLE_RELATIONSHIP_PATTERN)){
			Pattern p = Pattern.compile(InputPattern.SINGLE_RELATIONSHIP_PATTERN);
			Matcher m= p.matcher(clueAsString);
			if(m.find()){
				c = new SingleClue();
				c.setDstVar(m.group("variable"));
				c.setRelationship(m.group("relation"));
				c.setValue(Integer.parseInt(m.group("value")));
			}
		}else{
			if(clueAsString.matches(InputPattern.TWO_VARS_RELATIONSHIP_PATTERN)){
				Pattern p = Pattern.compile(InputPattern.TWO_VARS_RELATIONSHIP_PATTERN);
				Matcher m= p.matcher(clueAsString);
				if(m.find()){
					TwoVarsRelationshipClue clue = new TwoVarsRelationshipClue();
					clue.setDstVar(m.group("variable"));
					clue.setRelationship(m.group("relation"));
					clue.setSrcVar(m.group("srcvariable"));
					clue.setOperator(m.group("operator"));
					clue.setValue(Integer.parseInt(m.group("value")));
					c=clue;
					System.out.println(clue);
				}
			}
			
		}
		return c;
	}
}
