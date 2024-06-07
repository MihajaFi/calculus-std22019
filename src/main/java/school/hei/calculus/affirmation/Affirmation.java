package school.hei.calculus.affirmation;

public sealed abstract class Affirmation permits AffirmationComposee,Mensonge,Vérité {
    public abstract boolean estVrai();
}
