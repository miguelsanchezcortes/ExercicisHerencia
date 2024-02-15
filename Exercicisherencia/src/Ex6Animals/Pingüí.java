/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6Animals;

import java.time.LocalDate;

/**
 *
 * @author super
 */
public class Pingüí extends Au {

    public Pingüí(Sexe sexe, String nom, LocalDate dataNaixement) {
        super(sexe, nom, dataNaixement);
    }    

    @Override
    public void volar() {
        System.out.println("Ho tincs fotut per volar...");    }

    @Override
    public void juga() {
        System.out.println("Jugo a fer un forat al terra...");    }

    @Override
    public void getDutxa() {
        System.out.println("M'agrada l'aigua ben freda...");    }
    
}
