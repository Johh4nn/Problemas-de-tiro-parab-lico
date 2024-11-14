package objeto;

public class Datos {
    /* Declaro como atributos las variables que se presenta
        en el enunciado del ejercicio             */
    private double v0 ;
    private  double ang1;
    private  double ang2;


    public Datos() {
    }

    public Datos(double v0, double ang1, double ang2) {
        this.v0 = v0;
        this.ang1 = ang1;
        this.ang2 = ang2;

    }

    public double getV0() {
        return v0;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

    public double getAng1() {
        return ang1;
    }

    public void setAng1(double ang1) {
        this.ang1 = ang1;
    }

    public double getAng2() {
        return ang2;
    }

    public void setAng2(double ang2) {
        this.ang2 = ang2;
    }


}