package org.model;


public class Client extends Persona {
    private String adresa;

    private String saldo;

    public Client() {
    }

    public Client(String email, String telefon, int id, Fecha dataNaixement, NomComplet nomComplet) {
        super(email, telefon, id, dataNaixement, nomComplet);
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Client [adresa=" + adresa + ", saldo=" + saldo + "]";
    }

    

    

}
