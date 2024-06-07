package school.hei.calculus.affirmation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensongeTest {
    @Test

    void test_mensonge() {

        Mensonge mensonge = new Mensonge("Lou est pauvre");

        assertFalse(mensonge.estVrai());

    }

}