/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5HerenciaAbstractInterface;

/**
 *
 * @author super
 */
public class Ex5 {
    public static void main(String[] args) {
        //TODO
        //1.Crear un objecte de cada classe i provar que es pot fer
        Rectangle rectangle = new Rectangle(12, 7, "vermell", "blanc", 1, 12, 7);
        Triangle triangle = new Triangle(12, 7, "vermell", "blanc", 1);
        Quadrat quadrat = new Quadrat(8, "verd", "negre", 2);
        //2. Crear un array de figures i posar les figures a l'array
        FiguraGeometrica[] figures = new FiguraGeometrica[3];
        figures[0] = rectangle;
        figures[1] = triangle;
        figures[2] = quadrat;
        //3. Recorrer l'array i segons la classe de l'objecte que obtenim, 

        for (FiguraGeometrica figura : figures) {
            if (figura instanceof Rectangle) {
                System.out.println("Rectangle");
                System.out.println(figura);
            } else if (figura instanceof Triangle) {
                System.out.println("Triangle");
                System.out.println(figura);
            } else if (figura instanceof Quadrat) {
                System.out.println("Quadrat");
                System.out.println(figura);
            }
        }
        //fer una crida al seu mètode
    }
}
