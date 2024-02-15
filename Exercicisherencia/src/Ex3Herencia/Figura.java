/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3Herencia;

/**
 *
 * @author super
 */
public class Figura {

    private int dimensio1,dimensio2;
    private int perimetre;
    private int area;
    private String colorInterior;
    private String colorCantonada;
    private int grossorCantonada;
    
    public Figura(int dimensio1, int dimensio2) {
        this.dimensio1=dimensio1;
        this.dimensio2=dimensio2;
    }

    public Figura(int dimensio1, int dimensio2, String colorInterior, String colorCantonada, int grosorCantonada) {
        this.dimensio1 = dimensio1;
        this.dimensio2 = dimensio2;
        this.colorInterior = colorInterior;
        this.colorCantonada = colorCantonada;
        this.grossorCantonada = grosorCantonada;
    }
    
    

    public int getDimensio1() {
        return dimensio1;
    }

    public void setDimensio1(int dimensio1) {
        this.dimensio1 = dimensio1;
    }

    public int getDimensio2() {
        return dimensio2;
    }

    public void setDimensio2(int dimensio2) {
        this.dimensio2 = dimensio2;
    }    

    public int getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(int perimetre) {
        this.perimetre = perimetre;
    }

    public int getArea() {
        System.out.println("Area no definida...");
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColorInterior() {
        return colorInterior;
    }

    public void setColorInterior(String colorInterior) {
        this.colorInterior = colorInterior;
    }

    public String getColorCantonada() {
        return colorCantonada;
    }

    public void setColorCantonada(String colorCantonada) {
        this.colorCantonada = colorCantonada;
    }

    public int getGrossorCantonada() {
        return grossorCantonada;
    }

    public void setGrossorCantonada(int grosorCantonada) {
        this.grossorCantonada = grosorCantonada;
    }

    @Override
    public String toString() {
        return "Figura{" + "dimensio1=" + dimensio1 + ", dimensio2=" + dimensio2 + ", perimetre=" + perimetre + ", area=" + area + ", colorInterior=" + colorInterior + ", colorCantonada=" + colorCantonada + ", grosorCantonada=" + grossorCantonada + '}';
    }

    public void getMyClass(){
        System.out.println("Sóc de la classe: " + this.getClass().getSimpleName());
    }

}
