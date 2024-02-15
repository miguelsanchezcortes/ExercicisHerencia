/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5HerenciaAbstractInterface;

/**
 *
 * @author super
 */
public class Quadrat extends FiguraGeometrica implements InterfaceOptions {

    private int longitudCostat;
    private double cost;

    public Quadrat(int longitudCostat) {
        super(longitudCostat, longitudCostat);
        this.longitudCostat = longitudCostat;
        estableixArea();
        estableixPerimetre();
    }

    public Quadrat(int longitudCostat, String colorInterior, String colorCantonada, int grosorCantonada) {
        super(longitudCostat, longitudCostat, colorInterior, colorCantonada, grosorCantonada);
        this.longitudCostat = longitudCostat;
        estableixArea();
        estableixPerimetre();
    }

    public int getLongitudCostat() {
        return longitudCostat;
    }

    public void setLongitudCostat(int longitudCostat) {
        this.longitudCostat = longitudCostat;
    }

    //PROVEM A GENERAR ELS GETTERS I SETTERS??
    public void setPerimetre(int perimetre) {
        this.perimetre = perimetre;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quadrat{");
        sb.append("longitudCostat=").append(longitudCostat);
        sb.append('}');
        sb.append("\n\t");
        sb.append(super.toString());
        return sb.toString();
    }

//    @Override
//    public void getMyClass() {
//        
//    }
    @Override
    public void estableixPerimetre() {
        perimetre = longitudCostat * 4;
    }

    @Override
    public void estableixArea() {
        area = longitudCostat * longitudCostat;
    }

    @Override
    public void getMyClass() {
        System.out.println("Sóc de la classe: " + this.getClass().getSimpleName());
    }

    @Override
    public double costEuroArea() {
        double costEuro = EURO * area;
        this.cost = costEuro;
        return costEuro;
    }

    @Override
    public void posicio(int posicio) {
        switch (posicio) {
            case FIRST:
                System.out.println("Primer: " + FIRST);
                break;
            case SECOND:
                System.out.println("Segon: " + SECOND);
                break;
            case THIRD:
                System.out.println("Tercer: " + THIRD);
                break;
            default:
                System.out.println("Posició incorrecta");
        }
    }

    //no podem sobreescriure un mètode que al pare està declarat com final
    //@Override
    //public final void metodeFinalEnFiguraGeometrica() {
    //}
}
