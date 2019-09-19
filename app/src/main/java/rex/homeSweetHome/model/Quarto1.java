package rex.homeSweetHome.model;

public class Quarto1 {
    private Boolean Lampada5;
    private Boolean Ar1;

    public Boolean getLampada5() {
        return Lampada5;
    }

    public void setLampada5(Boolean lampada5) {
        Lampada5 = lampada5;
    }

    public Boolean getAr1() {
        return Ar1;
    }

    public void setAr1(Boolean ar1) {
        Ar1 = ar1;
    }

    @Override
    public String toString() {
        return "Quarto1{" +
                "Lâmpada=" + Lampada5 +
                ", Ar Condicionado=" + Ar1 +
                '}';
    }

}
