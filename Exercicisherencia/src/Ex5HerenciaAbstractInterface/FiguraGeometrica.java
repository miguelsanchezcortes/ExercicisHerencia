/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5HerenciaAbstractInterface;

/**
 *
 * @author super
 */
public abstract class FiguraGeometrica implements InterfaceFigura {

    private int dimensio1, dimensio2;
    protected int perimetre;
    protected int area;
    private String colorInterior;
    private String colorCantonada;
    private int grosorCantonada;

    public FiguraGeometrica(int dimensio1, int dimensio2) {
        this.dimensio1 = dimensio1;
        this.dimensio2 = dimensio2;
    }

    public FiguraGeometrica(int dimensio1, int dimensio2, String colorInterior, String colorCantonada, int grosorCantonada) {
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

    public final int getPerimetre() {
        return perimetre;
    }

    public final int getArea() {
        return area;
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

    //no podem sobreescriure un mètode que al pare està declarat com final
    public final void metodeFinalEnFiguraGeometrica() {
        System.out.println("Mètode final en Figura Geomètrica...");
    }

    //mètodes abstractes definits a l'interfície
    //fixeu-vos que no cal implementar-los perquè aquesta classe és una classe abstracta...
    //si que els implementarem a les classes filles de FiguraGeometrica quant fem el implements

}
