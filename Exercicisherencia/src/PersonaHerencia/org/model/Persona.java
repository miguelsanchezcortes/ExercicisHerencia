package org.model;


public abstract class Persona {
    private String email;

    private String telefon;

    private int id;

    private Fecha dataNaixement;

    private NomComplet nomComplet;

    public Persona() {
    }

    public Persona(String email, String telefon, int id, Fecha dataNaixement, NomComplet nomComplet) {
        this.email = email;
        this.telefon = telefon;
        this.id = id;
        this.dataNaixement = dataNaixement;
        this.nomComplet = nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fecha getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Fecha dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public NomComplet getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(NomComplet nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString() {
        return "Persona [email=" + email + ", telefon=" + telefon + ", id=" + id + ", dataNaixement=" + dataNaixement
                + ", nomComplet=" + nomComplet + "]";
    }


    

}
