/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class Adreça {
    String nomPersona;
    String nomCarrer;
    String nomPoblacio;
    String nomProvincia;
    String codiPostal;

    public Adreça(String nomPersona, String nomCarrer, String nomPoblacio, String nomProvincia, String codiPostal) {
        this.nomPersona = nomPersona;
        this.nomCarrer = nomCarrer;
        this.nomPoblacio = nomPoblacio;
        this.nomProvincia = nomProvincia;
        this.codiPostal = codiPostal;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getNomCarrer() {
        return nomCarrer;
    }

    public void setNomCarrer(String nomCarrer) {
        this.nomCarrer = nomCarrer;
    }

    public String getNomPoblacio() {
        return nomPoblacio;
    }

    public void setNomPoblacio(String nomPoblacio) {
        this.nomPoblacio = nomPoblacio;
    }

    public String getNomProvincia() {
        return nomProvincia;
    }

    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    @Override
    public String toString() {
        return "Adre\u00e7a{" + "nomPersona=" + nomPersona + ", nomCarrer=" + nomCarrer + ", nomPoblacio=" + nomPoblacio + ", nomProvincia=" + nomProvincia + ", codiPostal=" + codiPostal + '}';
    }
    
    
}
