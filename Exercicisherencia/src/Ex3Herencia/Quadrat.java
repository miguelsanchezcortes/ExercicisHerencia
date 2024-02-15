/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3Herencia;


/**
 *
 * @author super
 */
public class Quadrat extends Figura{
    private int longitudCostat;

    public Quadrat(int dimensio1) {
        super(dimensio1, dimensio1);
        super.setArea(dimensio1*dimensio1);
        super.setPerimetre(dimensio1*4);
        this.longitudCostat = dimensio1;        
    }

    public Quadrat(int dimensio1, String colorInterior, String colorCantonada, int grosorCantonada){
        super(dimensio1, dimensio1, colorInterior, colorCantonada, grosorCantonada);
        super.setArea(dimensio1*dimensio1);
        super.setPerimetre(dimensio1*4);
        this.longitudCostat = dimensio1; 
    }

    public int getLongitudCostat() {
        return longitudCostat;
    }

    public void setLongitudCostat(int longitudCostat) {
        this.longitudCostat = longitudCostat;
    }
    
    @Override
    public int getArea(){
        System.out.println("Estic en la classe Quadrat");
        return super.getArea();
    }
    
    @Override
    public int getPerimetre(){
        System.out.println("Estic en la classe Quadrat");
        return super.getPerimetre();
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
    
    public void metodeQuadrat(){
        System.out.println("Crida al mètode quadrat.");
    }
    
}
