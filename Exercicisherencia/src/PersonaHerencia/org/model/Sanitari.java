package org.model;

import org.enumerats.Especialitat;

public class Sanitari extends Treballador {
    private String titol;

    private Especialitat especialitat;

    public Sanitari() {
    }

    public Sanitari(String email, String telefon, int id, Fecha dataNaixement, NomComplet nomComplet) {
        super(email, telefon, id, dataNaixement, nomComplet);
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Especialitat getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(Especialitat especialitat) {
        this.especialitat = especialitat;
    }

    @Override
    public String toString() {
        return "Sanitari [titol=" + titol + ", especialitat=" + especialitat + "]";
    }

    

}
