package Ex6Animals;

import Ex6Animals.Animal.Sexe;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author super
 */
public class Ex6Animals {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Animal[] mascotes = new Animal[3];

        Gat elMeuGat = new Gat("persa", "plomes", Sexe.FEMELLA, "cuca", LocalDate.parse(("10/01/2000"), formatter));
        Pingüí elMeuPingui = new Pingüí(Sexe.MASCLE, "paquito", LocalDate.parse(("12/11/2005"), formatter));
        Periquito elMeuPeriquito = new Periquito(Sexe.FEMELLA, "xispi", LocalDate.parse(("10/08/2001"), formatter));

        mascotes[0] = elMeuGat;
        mascotes[1] = elMeuPingui;
        mascotes[2] = elMeuPeriquito;

        for (Animal a : mascotes) {
            switch (a.getClass().getSimpleName()) {
                case "Gat":
                    //Utilitzem tots els mètodes disponibles pel gat
                    System.out.println("");
                    if(a.getSexe().equals(Sexe.FEMELLA)){
                        System.out.println("Soc una gateta");
                    }else{
                        System.out.println("Soc un gat");
                    }                                                          
                    System.out.println("Em dic: " + a.getNom() +
                                    ", soc " + a.getSexe() +
                                    ", vaig naixer el " + a.getDataNaixement());
                    System.out.println("Vaig a menjar");
                    a.menja("sardina");
                    System.out.println("Vaig a dormir");
                    a.dorm();
                    System.out.println("Vaig a jugar");
                    a.juga();
                    System.out.println("A la dutxa!!!");
                    a.getDutxa();
                    System.out.println("");
                    break;
                case "Periquito":
                    //Utilitzem tots els mètodes disponibles pel periquito
                    System.out.println("");
                    if(a.getSexe().equals(Sexe.FEMELLA)){
                        System.out.println("Soc una perica");
                    }else{
                        System.out.println("Soc un perico");
                    }                                                          
                    System.out.println("Em dic: " + a.getNom() +
                                    ", soc " + a.getSexe() +
                                    ", vaig naixer el " + a.getDataNaixement());
                    System.out.println("Vaig a menjar");
                    a.menja("pienso");
                    System.out.println("Vaig a dormir");
                    a.dorm();
                    System.out.println("Vaig a jugar");
                    a.juga();
                    System.out.println("A la dutxa!!!");
                    a.getDutxa();
                    System.out.println("A veure si puc volar....");
                    ((Periquito) a).volar();
                    System.out.println("Vaig a cantar!!!!");
                    ((Periquito) a).canta();
                    System.out.println("");
                    break;
                case "Pingüí":
                     //Utilitzem tots els mètodes disponibles pel pingüí
                    System.out.println("");
                    if(a.getSexe().equals(Sexe.FEMELLA)){
                        System.out.println("Soc una pingüina");
                    }else{
                        System.out.println("Soc un Pingüí");
                    }                                                          
                    System.out.println("Em dic: " + a.getNom() +
                                    ", soc " + a.getSexe() +
                                    ", vaig naixer el " + a.getDataNaixement());
                    System.out.println("Vaig a menjar");
                    a.menja("pienso");
                    System.out.println("Vaig a dormir");
                    a.dorm();
                    System.out.println("Vaig a jugar");
                    a.juga();
                    System.out.println("A la dutxa!!!");
                    a.getDutxa();
                    System.out.println("A veure si puc volar....");
                    ((Pingüí) a).volar();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Animal desconegut...");
            }
        }

    }
}
