/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class Sobre extends Embalatge {

    int ample, alt;

    public Sobre(int ample, int alt, String color, Adreça origen, Adreça desti) {
        super(color, origen, desti, calculaVolum(ample, alt));
        this.ample = ample;
        this.alt = alt;
    }

    private static int calculaVolum(int ample, int alt) {
        return ample * alt * 1;//presuposem que el sobre té 1cm de llargaria
    }

    public int getAmple() {
        return ample;
    }

    public int getAlt() {
        return alt;
    }

    @Override
    public String toString() {
        return "Sobre{" + "ample=" + ample + ", alt=" + alt + '}';
    }

}
