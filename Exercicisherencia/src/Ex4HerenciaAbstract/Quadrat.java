/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4HerenciaAbstract;

/**
 *
 * @author super
 */
public class Quadrat extends Figura {

    private int longitudCostat;

    public Quadrat(int longitudCostat) {
        super(longitudCostat, longitudCostat);
        this.longitudCostat = longitudCostat;
    }

    public Quadrat(int dimensio1, String colorInterior, String colorCantonada, int grosorCantonada) {
        super(dimensio1, dimensio1, colorInterior, colorCantonada, grosorCantonada);
        this.longitudCostat = dimensio1;
        setArea();
        setPerimetre();
    }

    public int getLongitudCostat() {
        return longitudCostat;
    }

    public void setLongitudCostat(int longitudCostat) {
        this.longitudCostat = longitudCostat;
    }

//    @Override
//    public int getArea(){
//        System.out.println("Estic en la classe Quadrat");
//        return super.getArea();
//    }
//    
//    @Override
//    public int getPerimetre(){
//        System.out.println("Estic en la classe Quadrat");
//        return super.getPerimetre();
//    }
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

    public void metodeQuadrat() {
        System.out.println("Crida des del mètode quadrat.");
    }

    @Override
    public void setPerimetre() {
        this.perimetre = (longitudCostat * 4);
    }

    @Override
    public void setArea() {
        this.area = longitudCostat * longitudCostat;
    }

    //no podem sobreescriure un mètode que al pare està declarat com final
//    @Override
//    public final void metodeFinalEnFigura(){
//        System.out.println("Mètode final en Figura...");
//    }

    @Override
    public void metodeAbstracteNoFinal() {
        System.out.println("Estic al mètode abstracte de la Classe Quadrat.");
    }
}
