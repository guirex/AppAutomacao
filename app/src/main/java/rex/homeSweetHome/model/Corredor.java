package rex.homeSweetHome.model;

public class Corredor {
    private Boolean Lampada3;

    public Boolean getLampada3() {
        return Lampada3;
    }

    public void setLampada3(Boolean lampada3) {
        Lampada3 = lampada3;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "Lâmpada=" + Lampada3 +
                '}';
    }
}
