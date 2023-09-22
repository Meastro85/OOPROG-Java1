package wijnen;

public enum Smaak {
    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME, SEC, DEMI_SEC, DOUX;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
