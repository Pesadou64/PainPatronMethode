package com.example.painpatrondemthode;
import java.util.List;

/**
 * Définit l'algorithme
 */
public abstract class AbstractClass {
    /*
     * Algorithme
     * La méthode est final afin que l'algorithme
     * ne puisse pas être redéfini par une classe fille
     */
    public final String operationTemplate(int pNombr) { //Le point d'orgue est ici, on a un patron de méthode

        //Juste les affichages des méthodes qui changent via les concrete Classe différentes
        // for(int i=0;i<5;i++) {
        return operationAbs1() + operationAbs2(pNombr);
        //}
    }
    // Méthodes utilisées par l'algorithme
    // Elles seront implémentées par une sous-classe concrète
    public abstract String operationAbs1();
    public abstract String operationAbs2(int pNombr);
}

