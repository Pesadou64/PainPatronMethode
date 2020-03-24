package com.example.painpatrondemthode;

/**
 * Sous-classe concrète de AbstractClasse
 * Implémente les méthodes utilisées par l'algorithme
 * de la méthode operationTemplate() de AbstractClasse
 */
//Classe painDeSeigle hérite de la classe AbstractClass
public class PainDeSeigle extends AbstractClass {
    //Précision du fonctionnment de la méthode opérationAbs1 pour la classe Pain de seigle
    public String operationAbs1() {return "Origine : Espagne"; }
    //Précision du fonctionnment de la méthode opérationAbs2 pour la classe Pain de seigle
    public String operationAbs2(int pNombre) { return "\t Sa quantité est de :" + pNombre; }
}

