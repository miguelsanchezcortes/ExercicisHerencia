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
public abstract class Au extends Animal {
    
    public Au(Sexe sexe, String nom, LocalDate dataNaixement){
        super(sexe, nom, dataNaixement);
    }
    public abstract void volar();
}
