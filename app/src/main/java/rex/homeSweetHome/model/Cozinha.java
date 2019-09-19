package rex.homeSweetHome.model;

public class Cozinha {
    private Boolean Lampada2;

    public Boolean getLampada2() {
        return Lampada2;
    }

    public void setLampada2(Boolean lampada2) {
        Lampada2 = lampada2;
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "Lâmpada=" + Lampada2 +
                '}';
    }
}
