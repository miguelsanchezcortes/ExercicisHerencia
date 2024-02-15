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
public class Gat extends Animal {

    private String raça;
    private String joguinaFavorita;    

    public Gat(String raça, String joguinaFavorita, Sexe sexe, String nom, LocalDate dataNaixement) {
        super(sexe, nom, dataNaixement);
        this.raça = raça;
        this.joguinaFavorita = joguinaFavorita;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getJoguinaFavorita() {
        return joguinaFavorita;
    }

    public void setJoguinaFavorita(String joguinaFavorita) {
        this.joguinaFavorita = joguinaFavorita;
    }

    public void maula() {
        System.out.println("Miauuuu");
    }

    public void ronronea() {
        System.out.println("mrrrrrr");
    }

    @Override
    public void juga() {
        System.out.println("Jugo amb la piloteta...");    }

    @Override
    public void getDutxa() {
        System.out.println("Estic llepant-me.");
    }

}
