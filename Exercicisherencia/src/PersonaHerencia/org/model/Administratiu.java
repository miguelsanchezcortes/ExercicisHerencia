package org.model;


public class Administratiu extends Treballador {
    private Fecha dataAlta;

    public Administratiu() {
    }

    public Administratiu(String email, String telefon, int id, Fecha dataNaixement, NomComplet nomComplet) {
        super(email, telefon, id, dataNaixement, nomComplet);
    }

    public Fecha getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Fecha dataAlta) {
        this.dataAlta = dataAlta;
    }

    @Override
    public String toString() {
        return "Administratiu [dataAlta=" + dataAlta + "]";
    }

    

}
