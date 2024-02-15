package org.model;


public class Treballador extends Persona {
    private String numCompte;

    public Treballador() {
    }

    public Treballador(String email, String telefon, int id, Fecha dataNaixement, NomComplet nomComplet) {
        super(email, telefon, id, dataNaixement, nomComplet);
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public String toString() {
        return "Treballador [numCompte=" + numCompte + "]";
    }

    

}
