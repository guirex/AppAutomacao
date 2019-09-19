package rex.homeSweetHome.model;

public class Quarto3 {
    private Boolean Lampada7;
    private Boolean Ar3;

    public Boolean getLampada7() {
        return Lampada7;
    }

    public void setLampada7(Boolean lampada7) {
        Lampada7 = lampada7;
    }

    public Boolean getAr3() {
        return Ar3;
    }

    public void setAr3(Boolean ar3) {
        Ar3 = ar3;
    }

    @Override
    public String toString() {
        return "Quarto3{" +
                "Lâmpada=" + Lampada7 +
                ", Ar Condicionado=" + Ar3 +
                '}';
    }
}
