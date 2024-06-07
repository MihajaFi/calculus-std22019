package school.hei.calculus.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import school.hei.calculus.conjonction.Conjonction;
@Getter
@Setter
@AllArgsConstructor
@ToString
public final class AffirmationComposee extends Affirmation {
    private Affirmation gauche;
    private Affirmation droite;
    private Conjonction conjonction;

    @Override
    public boolean estVrai() {
        return conjonction.evalue(gauche.estVrai(), droite.estVrai());
    }

    public String valeur() {

        if (conjonction.evalue(gauche.estVrai(), droite.estVrai())) {

            return "vrai";

        } else {

            return "faux";

        }

    }

}
