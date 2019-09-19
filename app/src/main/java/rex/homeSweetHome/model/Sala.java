package rex.homeSweetHome.model;

public class Sala {
    private Boolean Lampada1;

    public Boolean getLampada1() {
        return Lampada1;
    }

    public void setLampada1(Boolean lampada1) {
        Lampada1 = lampada1;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "Lâmpada=" + Lampada1 +
                '}';
    }
}
