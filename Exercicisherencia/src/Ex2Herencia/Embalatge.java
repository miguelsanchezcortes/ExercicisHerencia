/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class Embalatge {

    private String color;
    private int volum;
    private Adreça origen, desti;

    public Embalatge(String color, Adreça origen, Adreça desti) {
        this.color = color;
        this.origen = origen;
        this.desti = desti;
    }
    
    public Embalatge(String color, Adreça origen, Adreça desti, int volum) {
        this.color = color;
        this.origen = origen;
        this.desti = desti;
        this.volum = volum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public Adreça getOrigen() {
        return origen;
    }

    public void setOrigen(Adreça origen) {
        this.origen = origen;
    }

    public Adreça getDesti() {
        return desti;
    }

    public void setDesti(Adreça desti) {
        this.desti = desti;
    }

    @Override
    public String toString() {
        return "Embalatge{" + "color=" + color + ", volum=" + volum + ", origen=" + origen + ", desti=" + desti + '}';
    }

}
