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
public class Periquito extends Au {

    public Periquito(Sexe sexe, String nom, LocalDate dataNaixement) {
        super(sexe, nom, dataNaixement);
    }
    
    public void canta(){
        System.out.println("Pio pio pio....");
    }

    @Override
    public void volar() {
        System.out.println("Puc volar però no em deixen sortir de la gàvia");
    }

    @Override
    public void juga() {
        System.out.println("Jugo i crido molt!!!!");
    }

    @Override
    public void getDutxa() {
        System.out.println("Llenço aigua per l'aire...");
    }

}
