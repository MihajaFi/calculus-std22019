package school.hei.calculus.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public final class Mensonge extends Affirmation {
    private String description;

    @Override
    public boolean estVrai() {
        return false;
    }

}