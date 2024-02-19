package org;

import org.model.Client;
import org.model.NomComplet;
import org.model.Persona;
import org.model.Treballador;

public class Main {
    public static void main(String[] args) {
        NomComplet nom1 = new NomComplet();
        nom1.setNom("Miguel");
        nom1.setCognom1("Sánchez");
        nom1.setCognom2("Cortes");

        Persona[] persones = new Persona[3];
        Treballador treballador = new Treballador();
        treballador.setEmail("miguel.sanchez@cirvianum.cat");
        treballador.setTelefon("666666666");
        treballador.setId(1);
        treballador.setNumCompte("ES6621000418401234567891");
        treballador.setNomComplet(nom1);
        
        persones[0] = treballador;
        Client client1 = new Client();
        client1.setEmail("misaco2003@gmail.com");
        client1.setTelefon("666666666");
        client1.setId(2);
        client1.setAdresa("Carrer de la Rosa, 12");
        client1.setSaldo("1000");
        client1.setNomComplet(nom1);

        persones[1] = client1;
    }
}
