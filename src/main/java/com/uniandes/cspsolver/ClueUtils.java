package com.uniandes.cspsolver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClueUtils {
	
	
	public static SingleClue parseStringToClue(String clueAsString){
		SingleClue c=null;
		if(clueAsString.matches(Clue.SINGLE_RELATIONSHIP_PATTERN)){
			Pattern p = Pattern.compile(Clue.SINGLE_RELATIONSHIP_PATTERN);
			System.out.println(p.toString());
			Matcher m= p.matcher(clueAsString);
			if(m.find()){
				c = new SingleClue();
				c.setDstVar(m.group("variable"));
				c.setRelationship(m.group("relation"));
				c.setValue(m.group("value"));
			}
		}
		return c;
	}
}
