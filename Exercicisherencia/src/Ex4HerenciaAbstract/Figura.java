/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4HerenciaAbstract;

/**
 *
 * @author super
 */
public abstract class Figura {

    private int dimensio1, dimensio2;
    protected int perimetre;
    protected int area;
    private String colorInterior;
    private String colorCantonada;
    private int grosorCantonada;

    public Figura(int dimensio1, int dimensio2) {
        this.dimensio1 = dimensio1;
        this.dimensio2 = dimensio2;
    }

    public Figura(int dimensio1, int dimensio2, String colorInterior, String colorCantonada, int grosorCantonada) {
        this.dimensio1 = dimensio1;
        this.dimensio2 = dimensio2;
        this.colorInterior = colorInterior;
        this.colorCantonada = colorCantonada;
        this.grosorCantonada = grosorCantonada;
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

    public int getArea() {
        return area;
    }

    //mètodes abstractes de la classe, que s'han d'implementar a les classes filles
    //pq cada classe filla ho implementarà d'una manera diferent
    public abstract void setPerimetre();

    public abstract void setArea();

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

    public int getGrosorCantonada() {
        return grosorCantonada;
    }

    public void setGrosorCantonada(int grosorCantonada) {
        this.grosorCantonada = grosorCantonada;
    }

    @Override
    public String toString() {
        return "Figura{" + "dimensio1=" + dimensio1 + ", dimensio2=" + dimensio2 + ", perimetre=" + perimetre + ", area=" + area + ", colorInterior=" + colorInterior + ", colorCantonada=" + colorCantonada + ", grosorCantonada=" + grosorCantonada + '}';
    }

    public void getMyClass() {
        System.out.println("Sóc de la classe: " + this.getClass().getSimpleName());
    }
    
    public abstract void metodeAbstracteNoFinal();
    
    //no podem sobreescriure un mètode que al pare està declarat com final
    public final void metodeFinalEnFigura(){
        System.out.println("Mètode final en Figura...");
    }

}
