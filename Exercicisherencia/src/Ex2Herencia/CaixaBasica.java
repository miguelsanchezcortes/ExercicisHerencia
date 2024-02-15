/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class CaixaBasica extends Embalatge {

    final int ample = 5, llarg = 5, alt = 4;

    public CaixaBasica(String color, Adreça origen, Adreça desti) {
        super(color, origen, desti);
        
        setVolum();
    }

    private void setVolum() {
        int volum = ample * llarg * alt;
        super.setVolum(volum);
    }

    public int getAmple() {
        return ample;
    }

    public int getLlarg() {
        return llarg;
    }

    public int getAlt() {
        return alt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaixaBasica{");
        sb.append("ample=").append(ample);
        sb.append(", llarg=").append(llarg);
        sb.append(", alt=").append(alt);
        sb.append('}');
        return sb.toString();
    }
    
    

}
