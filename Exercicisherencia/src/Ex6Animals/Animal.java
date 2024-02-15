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
public abstract class Animal implements InterfaceAnimal {

    public enum Sexe {
        MASCLE, FEMELLA, HERMAFRODITA
    };

    private Sexe sexe;
    private String nom;
    private LocalDate dataNaixement;

    public Animal(Sexe sexe, String nom, LocalDate dataNaixement) {
        this.sexe = sexe;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAnimal{");
        sb.append("sexe=").append(sexe);
        sb.append(", nom=").append(nom);
        sb.append(", dataNaixement=").append(dataNaixement);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void dorm() {
        System.out.println("Zzzzz...");
    }

    @Override
    public void menja(String menjar) {
        System.out.println("Nyam!!!!... " + menjar);
    }

    //mètode diferent perquè cada animal pot jugar diferent
    //per això el declarem com abstracte
    @Override
    public abstract void juga();

    @Override
    public abstract void getDutxa();

}
