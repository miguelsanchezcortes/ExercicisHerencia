/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class Tub extends Embalatge{
    private int radi;
    private int longitud;

    public Tub(int radi, int longitud, String color, Adreça origen, Adreça desti) {
        super(color, origen, desti, calculaVolum(radi,longitud));
        this.radi = radi;
        this.longitud = longitud;
    }
    
    private static int calculaVolum(int radi, int longitud){
        return (int) (2 * Math.PI * Math.pow(radi,2) * longitud);
    }

    public int getRadi() {
        return radi;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tub{");
        sb.append("radi=").append(radi);
        sb.append(", longitud=").append(longitud);
        sb.append('}');
        return sb.toString();
    }
    
    
}
