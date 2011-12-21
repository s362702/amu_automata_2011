package pl.edu.amu.wmi.daut.re;

import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import pl.edu.amu.wmi.daut.base.NaiveAutomatonSpecification;
import pl.edu.amu.wmi.daut.base.CharClassTransitionLabel;
import pl.edu.amu.wmi.daut.base.State;

 /**
 *
 * Reprezentującą klasę znaków z wyrażeń regularnych
 */
public class CharClassOperator extends NullaryRegexpOperator {
    private String c;

    /**
     *
     * konstruktor ustawiający klasę znaków
     */
    public void setCharClass(String a) {
                this.c = a;
    }
    @Override
    public AutomatonSpecification createFixedAutomaton() {
        AutomatonSpecification automaton = new NaiveAutomatonSpecification();
        State q0 = automaton.addState();
        State q1 = automaton.addState();
        automaton.addTransition(q0, q1, new
CharClassTransitionLabel(c));
        automaton.markAsInitial(q0);
        automaton.markAsFinal(q1);

        return automaton;
    }
}
