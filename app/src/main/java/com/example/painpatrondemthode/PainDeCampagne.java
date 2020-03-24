package com.example.painpatrondemthode;

import java.util.List;

/**
 * Sous-classe concrète de AbstractClasse
 * Implémente les méthodes utilisées par l'algorithme
 * de la méthode operationTemplate() de AbstractClasse
 */
//Classe painDeCampagne hérite de la classe AbstractClass
public class PainDeCampagne extends AbstractClass {

    //Précision du fonctionnment de la méthode opérationAbs1 pour la classe Pain de campagne
    public String operationAbs1() { return "Origine : France "; }
    //Précision du fonctionnment de la méthode opérationAbs2 pour la classe Pain de campagne
    public String operationAbs2(int pNombre) { return "\t Sa quantité est de " + pNombre; }
}

