package school.hei.calculus.conjonction;

public enum Conjonction {
    ET {
        @Override
        public boolean evalue(boolean gauche, boolean droite) {
            return gauche && droite;
        }
    },
    OU {
        @Override
        public boolean evalue(boolean gauche, boolean droite) {
            return gauche || droite;
        }
    },
    DONC {
        @Override
        public boolean evalue(boolean gauche, boolean droite) {
            return !(gauche && !droite);
        }
    };

    public abstract boolean evalue(boolean gauche, boolean droite);
}
