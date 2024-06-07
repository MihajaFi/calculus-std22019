package school.hei.calculus.affirmation;

import org.junit.jupiter.api.Test;
import school.hei.calculus.conjonction.Conjonction;

import static org.junit.jupiter.api.Assertions.*;

class AffirmationTest {
    @Test
    void test_Lou_est_pauvre_et_Lou_est_généreux() {
        Affirmation mensonge_1 = new Mensonge("Lou est pauvre");
        Affirmation verite_1 = new Vérité("Lou est généreux");
        Affirmation composition = new AffirmationComposee(mensonge_1, verite_1, Conjonction.ET);
        assertFalse(composition.estVrai());

    }
}