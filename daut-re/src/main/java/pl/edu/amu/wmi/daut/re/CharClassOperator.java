package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.AutomatonSpecification;               
import pl.edu.amu.wmi.daut.base.NaiveAutomatonSpecification;
import pl.edu.amu.wmi.daut.base.CharClassTransitionLabel;
import pl.edu.amu.wmi.daut.base.State;

/**
 * Reprezentuje klasę znaków z wyrażeń regularnych.
 */ 
public class CharClassOperator extends NullaryRegexpOperator {
    private String charClass;

    /**
     * Konstruktor, pobiera pożądaną klasę znaków.
     */
    public CharClassOperator(String Class) {
        charClass = Class;
    }
    @Override
    public AutomatonSpecification createFixedAutomaton() {
        AutomatonSpecification automaton = new NaiveAutomatonSpecification();
        State q0 = automaton.addState();
        State q1 = automaton.addState();
        automaton.addTransition(q0, q1, new CharClassTransitionLabel(charClass));
        automaton.markAsInitial(q0);
        automaton.markAsFinal(q1);

        return automaton;
    }        
}
