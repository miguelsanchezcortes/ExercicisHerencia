/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4HerenciaAbstract;


/**
 *
 * @author super
 */
public class Ex4 {
    public static void main(String[] args) {
        //TODO
        //1.Crear un objecte de cada classe i provar que es pot fer
        Quadrat q = new Quadrat(5, "vermell", "negre", 2);
        Rectangle r = new Rectangle(3, 6, "blau", "blanc", 1);
        Triangle t = new Triangle(3, 4, "verd", "groc", 1);
        //2. Crear un array de figures i posar les figures a l'array
        Figura[] figures = new Figura[3];
        figures[0] = q;
        figures[1] = r;
        figures[2] = t;

        //3. Recorrer l'array i segons la classe de l'objecte que obtenim, 

        for (Figura figura : figures) {
            System.out.println(figura);
        }
        //fer una crida al seu mètode
        
        
    }
    
}
