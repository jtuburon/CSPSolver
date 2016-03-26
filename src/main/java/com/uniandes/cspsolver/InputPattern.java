package com.uniandes.cspsolver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputPattern {
	public final static String EQUIVALENCE_RELATIONSHIP="=";
	public final static String GT_RELATIONSHIP=">";
	public final static String LT_RELATIONSHIP="<";
	public final static String G_E_T_RELATIONSHIP=">=";
	public final static String L_E_T_RELATIONSHIP="<=";
	
	public final static String ADDITION_OPERATOR="+";
	public final static String SUBSTRACTION_OPERATOR="-";
	public final static String PRODUCT_OPERATOR="*";
	public final static String DIVISION_OPERATOR="/";
	
	public final static String VARIABLE_PATTERN="(?<variable>(A|B)[1-4])";
	public final static String WHITESPACES_PATTERN="\\s*";
	public final static String RELATIONSHIP_PATTERN="(?<relation>("+EQUIVALENCE_RELATIONSHIP + "|" + GT_RELATIONSHIP + "|" + LT_RELATIONSHIP + "|" + G_E_T_RELATIONSHIP + "|" + L_E_T_RELATIONSHIP+"))";
	public final static String VALUE_PATTERN="(?<value>\\d+)";
	
	public final static String FOUR_VALUES_PATTERN="(?<domain>\\d+(\\s*,\\s*\\d+){3})";
	
	public final static String DOMAIN_PATTERN= "\\{"+ WHITESPACES_PATTERN + FOUR_VALUES_PATTERN+  WHITESPACES_PATTERN+ "\\}";
	
	public final static String FOUR_VARIABLE_ALIASES_PATTERN="\"(?<alias01>(\\w+(\\s+\\w+)*)?)\"\\s*,\\s*\"(?<alias02>(\\w+(\\s+\\w+)*)?)\"\\s*,\\s*\"(?<alias03>(\\w+(\\s+\\w+)*)?)\"\\s*,\\s*\"(?<alias04>(\\w+(\\s+\\w+)*)?)\"";
	
	public final static String VARIABLE_ALIASES_PATTERN= "\\{"+ WHITESPACES_PATTERN + FOUR_VARIABLE_ALIASES_PATTERN+  WHITESPACES_PATTERN+ "\\}";
	
	
	public final static String SRC_VARIABLE_PATTERN="(?<srcvariable>(A|B)[1-4])";
	
	public final static String ARITHMETIC_OPERATOR_PATTERN="(?<operator>[+|-|\\*|/])";
	
	public final static String SINGLE_RELATIONSHIP_PATTERN =VARIABLE_PATTERN + WHITESPACES_PATTERN + RELATIONSHIP_PATTERN + WHITESPACES_PATTERN + VALUE_PATTERN;
	
	public final static String TWO_VARS_RELATIONSHIP_PATTERN =VARIABLE_PATTERN + WHITESPACES_PATTERN + RELATIONSHIP_PATTERN + WHITESPACES_PATTERN + SRC_VARIABLE_PATTERN + WHITESPACES_PATTERN + ARITHMETIC_OPERATOR_PATTERN +WHITESPACES_PATTERN + VALUE_PATTERN;
	
	
	public static boolean validateDomainInput(String domainAsString){
		return Pattern.matches(DOMAIN_PATTERN, domainAsString);
	}
	
	public static boolean validateVariablesAliases(String aliasesAsString){
		return Pattern.matches(VARIABLE_ALIASES_PATTERN, aliasesAsString);
	}
	
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
