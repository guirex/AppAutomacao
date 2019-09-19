package rex.homeSweetHome.model;

public class Quarto2 {
    private Boolean Lampada6;
    private Boolean Ar2;

    public Boolean getLampada6() {
        return Lampada6;
    }

    public void setLampada6(Boolean lampada6) {
        Lampada6 = lampada6;
    }

    public Boolean getAr2() {
        return Ar2;
    }

    public void setAr2(Boolean ar2) {
        Ar2 = ar2;
    }

    @Override
    public String toString() {
        return "Quarto2{" +
                "Lâmpada=" + Lampada6 +
                ", Ar Condicionado=" + Ar2 +
                '}';
    }
}
