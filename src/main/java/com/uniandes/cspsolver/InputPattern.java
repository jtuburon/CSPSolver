package com.uniandes.cspsolver;

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
	
	public final static String SRC_VARIABLE_PATTERN="(?<srcvariable>(A|B)[1-4])";
	
	public final static String ARITHMETIC_OPERATOR_PATTERN="(?<operator>[+|-|\\*|/])";
	
	public final static String SINGLE_RELATIONSHIP_PATTERN =VARIABLE_PATTERN + WHITESPACES_PATTERN + RELATIONSHIP_PATTERN + WHITESPACES_PATTERN + VALUE_PATTERN;
	
	public final static String TWO_VARS_RELATIONSHIP_PATTERN =VARIABLE_PATTERN + WHITESPACES_PATTERN + RELATIONSHIP_PATTERN + WHITESPACES_PATTERN + SRC_VARIABLE_PATTERN + WHITESPACES_PATTERN + ARITHMETIC_OPERATOR_PATTERN +WHITESPACES_PATTERN + VALUE_PATTERN;
	
	
	public static boolean validateDomainInput(String domainAsString){
		return Pattern.matches(DOMAIN_PATTERN, domainAsString);
	}
	
}
