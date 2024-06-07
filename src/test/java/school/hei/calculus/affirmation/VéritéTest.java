package school.hei.calculus.affirmation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VéritéTest {
    @Test

    void test_vérité() {

        Vérité verite = new Vérité("Lou est généreux");

        assertTrue(verite.estVrai());

    }


    @Test

    void testDescription() {

        Vérité verite = new Vérité("Lou est beau");

        assertEquals("Lou est beau", verite.getDescription());

    }
}