package catcafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FelineOverLordTest {

    // assert bedeutet Behaupten
    /*
    Hier wird die intialisierung des Objekts getestet und ob die Methode name() den passenden Namen
    zurueckgibt
     */
    @Test
    void name_passes_when_assertion_is_true() {
        FelineOverLord testLord = new FelineOverLord("Mieze", 5);
        assertEquals(testLord.name(), "Mieze");
    }

    // s.o nur mit weight()
    @Test
    void weight_passes_when_assertion_is_true() {
        FelineOverLord testLord = new FelineOverLord("Mieze", 5);
        assertEquals(testLord.name(), "Mieze");
    }

    /*
    test fuer compare()
     */
    @Test
    void compare_passes_when_assertion_is_true() {
        FelineOverLord testMieze = new FelineOverLord("Mieze", 5);
        FelineOverLord testMauzie = new FelineOverLord("Mauzie", 12);
        assertEquals(testMauzie.compareTo(testMieze), 12-5);
    }

    @Test
    void testToString_passes_when_assertion_is_true() {
        FelineOverLord testMieze = new FelineOverLord("Mieze", 5);
        assertEquals(testMieze.toString(),"FelineOverLord[name=Mieze, weight=5]");
    }
}
