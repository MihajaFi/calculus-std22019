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
        assertEquals("faux", ((AffirmationComposee) composition).valeur());

    }

    @Test
    void test_Lou_est_beau_donc_Lou_est_pauvre() {
        Affirmation verite_1 = new Vérité("Lou est beau");
        Affirmation mensonge_1 = new Mensonge("Lou est pauvre");
        Affirmation composition = new AffirmationComposee(verite_1, mensonge_1, Conjonction.DONC);
        assertEquals("faux", ((AffirmationComposee) composition).valeur());
    }

    @Test
    void test_Lou_est_pauvre_donc_Lou_est_généreux() {
        Affirmation mensonge_1 = new Mensonge("Lou est pauvre");
        Affirmation verite_1 = new Vérité("Lou est généreux");
        Affirmation composition = new AffirmationComposee(mensonge_1, verite_1, Conjonction.DONC);
        assertEquals("vrai", ((AffirmationComposee) composition).valeur());
        System.out.println(composition.toString());
    }
    @Test

    void test_Lou_est_beau_ou_Lou_est_généreux_donc_Lou_est_pauvre() {

        Affirmation verite_1 = new Vérité("Lou est beau");

        Affirmation verite_2 = new Vérité("Lou est généreux");

        Affirmation composition1 = new AffirmationComposee(verite_1, verite_2, Conjonction.OU);

        Affirmation mensonge_1 = new Mensonge("Lou est pauvre");

        Affirmation composition2 = new AffirmationComposee(composition1, mensonge_1, Conjonction.DONC);

        assertEquals("faux", ((AffirmationComposee) composition2).valeur());

    }


}