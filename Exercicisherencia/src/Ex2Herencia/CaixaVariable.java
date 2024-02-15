/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class CaixaVariable extends Embalatge{

    int ample, llarg, alt;

    public CaixaVariable(int ample, int llarg, int alt, String color, Adreça origen, Adreça desti) {
        super(color, origen, desti, (ample * llarg * alt ));
        this.ample = ample;
        this.llarg = llarg;
        this.alt = alt;
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
        return "CaixaVariable{" + "ample=" + ample + ", llarg=" + llarg + ", alt=" + alt + '}';
    }
    
    
    
    
}
