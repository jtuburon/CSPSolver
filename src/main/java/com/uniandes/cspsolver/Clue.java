package com.uniandes.cspsolver;

public abstract class Clue {
	public final static String FOUND_SOLUTION_RULE_NAME="Found Solution";
	public final static String FOUND_SOLUTION_RULE_DESC="Determina la existencia de una solución en función de la existencias de asignaciones únicas para cada Variable de las dos dimensiones. Actualiza el hecho Solution. ";
	
	public final static String PARTIAL_SOLUTION_RULE_NAME="Show Partial-Solution";
	public final static String PARTIAL_SOLUTION_RULE_DESC="Visualiza la solución parcial  construida por el solver a medida que aplica una regla.";
	
	public final static String DIRECT_ASSIGNMENT_CLUE_RULE_NAME="DirectAssignmentClue";
	public final static String DIRECT_ASSIGNMENT_CLUE_RULE_DESC="Restringe el dominio de una variable a un único valor, cuando existe una pista de tipo SingleClue que la asocia con la relación de equivalencia a un valor.";
	
	public final static String DIRECT_ASSIGNMENT_PROPAGATION_RULE_NAME="DirectAssignmentPropagation";
	public final static String DIRECT_ASSIGNMENT_PROPAGATION_RULE_DESC="Excluye el único valor del dominio de una variable de las demás variables de la dimensión.";
	
	public final static String SINGLE_DOMAIN_REDUCTION_RULE_NAME="SingleDomainReduction";
	public final static String SINGLE_DOMAIN_REDUCTION_RULE_DESC="Reduce el dominio de una variable cuando se tiene una pista SingleClue que la asocia con alguna relación de orden a un valor.";
	
	public final static String INVALUES_CLUE_DOMAIN_REDUCTION_RULE_NAME="InValuesClueDomainReduction";
	public final static String INVALUES_CLUE_DOMAIN_REDUCTION_RULE_DESC="Reduce el dominio de una variable a los valores incluidos en la lista de valores de una pista de tipo  InValuesClue.";
	
	public final static String NOT_IN_VALUES_CLUE_DOMAIN_REDUCTION_RULE_NAME="NotInValuesClueDomainReduction";
	public final static String NOT_IN_VALUES_CLUE_DOMAIN_REDUCTION_RULE_DESC="Reduce el dominio de una variables excluyendo los valores contenidos en la lista de valores de una pista de tipo InValuesClue.";
	
	public final static String TWO_VARS_RELATIONSHIP_CLUE_RULE_NAME="TwoVarsRelationshipClue";
	public final static String TWO_VARS_RELATIONSHIP_CLUE_RULE_DESC="Genera pistas que permiten reducir dominios de las dos variables relacionadas en una pista de tipo TwoVarsRelationshipClue.";
	
	public final static String ONEVAR_DIFF_3VARS_IN_A_DIFF_GROUP_01_RULE_NAME="1VarDiff3VarsInADiffGroup01";
	public final static String ONEVAR_DIFF_3VARS_IN_A_DIFF_GROUP_01_RULE_DESC="Permite inferir que cuando se tienen pistas que afirman una variable de la dimensión A es distinta de tres variables de la dimensión B, esta es equivalente a la cuarta restante en la dimensión B. Como consecuencia se agrega una pista tipo TwoVarsRelationshipClue a la base de hechos que manifiesta dicha equivalencia.";
	
	public final static String ONEVAR_DIFF_3VARS_IN_A_DIFF_GROUP_02_RULE_NAME="1VarDiff3VarsInADiffGroup02";
	public final static String ONEVAR_DIFF_3VARS_IN_A_DIFF_GROUP_02_RULE_DESC="Permite inferir que cuando se tienen pistas que afirman una variable de la dimensión B es distinta de tres variables de a dimensión A, esta es equivalente a la cuarta restante en la dimensión A. Como consecuencia se agrega una pista tipo TwoVarsRelationshipClue a la base de hechos que manifiesta dicha equivalencia.";
	
	public final static String THREE_VARS_TWO_CLUES_01_RULE_NAME="3Vars2Clues01";
	public final static String THREE_VARS_TWO_CLUES_01_RULE_DESC="Permite restringir el dominio de tres variables en función de dos pistas tipo TwoVarsRelationshipClue que las relacionen.\nPista1: A = B + valor\nPista2: B = C + valor";
	
	public final static String THREE_VARS_TWO_CLUES_02_RULE_NAME="3Vars2Clues02";
	public final static String THREE_VARS_TWO_CLUES_02_RULE_DESC="Permite restringir el dominio de tres variables en función de dos pistas tipo TwoVarsRelationshipClue que las relacionen.\nPista1: A = B + valor\nPista2: C = B + valor";
	
	public final static String THREE_VARS_TWO_CLUES_03_RULE_NAME="3Vars2Clues03";
	public final static String THREE_VARS_TWO_CLUES_03_RULE_DESC="Permite restringir el dominio de tres variables en función de dos pistas tipo TwoVarsRelationshipClue que las relacionen.\nPista1: A = B + valor\nPista2: A = C + valor";
	
	public final static String CUSTOM_XOR_CLUE_RULE_NAME="XORClueRule01";
	public final static String CUSTOM_XOR_CLUE_RULE_DESC="Deduce que la pista de la derecha de una pista tipo XORClue es cierta tras validar que la de la izquierda es falsa. Agrega la pista deducida a la base de hechos.";
	
	public final static String XOR_CLUE_01_RULE_NAME="XORClueRule02";
	public final static String XOR_CLUE_01_RULE_DESC="Deduce que la pista de la izquierda de una pista tipo XORClue es cierta tras validar que la de la derecha es falsa. Agrega la pista deducida a la base de hechos.";
	
	public final static String XOR_CLUE_02_RULE_NAME="CustomXORClueRule";
	public final static String XOR_CLUE_02_RULE_DESC="Genera una pista tipo AllDiff de las dos variables relacionadas en las pistas tipo SingleClue de una pista XORClue cuando las dos pistas SingleClue comparten el mismo valor.";
	
	public final static String ONLY_ONE_VALUE_IN_A_VAR_DIMENSION_RULE_NAME="OnlyOneValueInAVarDimension";
	public final static String ONLY_ONE_VALUE_IN_A_VAR_DIMENSION_RULE_DESC="Restringe el dominio de una variable de una dimensión a un valor cuando éste no se encuentra en el dominio de las tres variables restantes de la misma dimensión.";
	
}
