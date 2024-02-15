/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3Herencia;

/**
 *
 * @author super
 */
public class Ex3 {

    public static void main(String[] args) {

        //Exemple 1
        //Creem objectes de la Classe figura i els posem a un array
        //són objectes de la subclasse però dins d'un apuntador a la superclasse
        System.out.println("Exemple 1");
        Figura f1 = new Quadrat(10, "groc", "taronja", 1);
        Figura f2 = new Triangle(5, 3, "verd", "negre", 2);
        Figura f3 = new Quadrat(10, "groc", "taronja", 1);
        Figura f4 = new Rectangle(3, 1, "gris", "violeta", 3);
        Figura f5 = new Triangle(5, 3, "verd", "negre", 2);
        Figura f6 = new Quadrat(10, "groc", "taronja", 1);
        Figura f7 = new Triangle(5, 3, "verd", "negre", 2);
        Figura f8 = new Quadrat(10, "groc", "taronja", 1);
        Figura f9 = new Rectangle(1, 2, "marró", "blanc", 3);
        Figura f10 = new Triangle(5, 3, "verd", "negre", 2);
        Figura f11 = new Quadrat(10, "groc", "taronja", 1);
        Figura f12 = new Triangle(5, 3, "verd", "negre", 2);
        Figura f13 = new Rectangle(3, 2, "gris", "blanc", 3);
        Figura f14 = new Rectangle(1, 1, "gris", "blau", 3);
        //Els posem a un array
        Figura[] figures1 = new Figura[14];
        figures1[0] = f1;
        figures1[1] = f2;
        figures1[2] = f3;
        figures1[3] = f4;
        figures1[4] = f5;
        figures1[5] = f6;
        figures1[6] = f7;
        figures1[7] = f8;
        figures1[8] = f9;
        figures1[9] = f10;
        figures1[10] = f11;
        figures1[11] = f12;
        figures1[12] = f13;
        figures1[13] = f14;
        //recorrem l'array i els mostrem
        for (Figura f : figures1) {
            System.out.println(f.toString() + "\n" + f.getClass().getSimpleName());
            System.out.println("");
        }
        //que passa si intentem executar un mètode d'una subclasse?

        //Exemple 2
        //creem objectes de la seva classe
        System.out.println("\nExemple 2");
        Quadrat q1 = new Quadrat(10, "groc", "taronja", 1);
        Triangle t1 = new Triangle(5, 3, "verd", "negre", 2);
        Quadrat q2 = new Quadrat(10, "groc", "taronja", 1);
        Rectangle r1 = new Rectangle(3, 1, "gris", "violeta", 3);
        Triangle t2 = new Triangle(5, 3, "verd", "negre", 2);
        Quadrat q3 = new Quadrat(10, "groc", "taronja", 1);
        Triangle t3 = new Triangle(5, 3, "verd", "negre", 2);
        Quadrat q4 = new Quadrat(10, "groc", "taronja", 1);
        Rectangle r2 = new Rectangle(1, 2, "marró", "blanc", 3);
        Triangle t4 = new Triangle(5, 3, "verd", "negre", 2);
        Quadrat q5 = new Quadrat(10, "groc", "taronja", 1);
        Triangle t5 = new Triangle(5, 3, "verd", "negre", 2);
        Rectangle r3 = new Rectangle(3, 2, "gris", "blanc", 3);
        Rectangle r4 = new Rectangle(1, 1, "gris", "blau", 3);
        //Els posem a un array de la seva superclasse (així els podem agrupar)
        Figura[] figures2 = new Figura[14];
        figures2[0] = q1;
        figures2[1] = t1;
        figures2[2] = q2;
        figures2[3] = r1;
        figures2[4] = t2;
        figures2[5] = q3;
        figures2[6] = t3;
        figures2[7] = q4;
        figures2[8] = r2;
        figures2[9] = t4;
        figures2[10] = q5;
        figures2[11] = t5;
        figures2[12] = r3;
        figures2[13] = r4;
        //recorrem l'array i els mostrem
        for (Figura f : figures2) {
            System.out.println(f.toString());
        }

        //Exemple 3
        //Creem un array de figures com apuntador però en realitat creem un array de quadrats
        //Què passa?
//        System.out.println("\nExemple 3");
//        Figura[] quadrats = new Quadrat[5];
//        quadrats[0] = q1;
//        quadrats[0] = t2;
//        quadrats[0] = r1;
//        quadrats[0] = r2;
//        quadrats[0] = q2;
//        for (Figura f : quadrats) {
//            System.out.println(f.toString());
//            System.out.println("");
//        }
        //Exemple 4
        //Creem un array per cada classe i posem cada objecte a dintre del seu array
        System.out.println("\nExemple 4");
        Quadrat[] quadrat10 = new Quadrat[5];
        Triangle[] triangle10 = new Triangle[5];
        Rectangle[] rectangle10 = new Rectangle[4];

        String laMevaClasse = "";
        int contQuadrat = 0, contTriangle = 0, contRectangle = 0;
        int comptador = 0;
        for (Figura f : figures2) {
            f.getMyClass();
            laMevaClasse = f.getClass().getSimpleName();
            switch (laMevaClasse) {
                case "Triangle":
                    ((Triangle) f).metodeTriangle();
                    triangle10[contQuadrat] = (Triangle) figures2[comptador];
                    contQuadrat++;
                    break;
                case "Quadrat":
                    ((Quadrat) f).metodeQuadrat();
                    quadrat10[contTriangle] = (Quadrat) figures2[comptador];
                    contTriangle++;
                    break;
                case "Rectangle":
                    ((Rectangle) f).metodeRectangle();
                    rectangle10[contRectangle] = (Rectangle) figures2[comptador];
                    contRectangle++;
                    break;
                default:
                    throw new AssertionError();
            }
            comptador++;
        }

        //llistem cadascun dels arrays per separat
        System.out.println("");
        System.out.println("Objectes Quadrat");
        for(Quadrat q: quadrat10){
            System.out.println(q.toString());
        }
        System.out.println("");
        System.out.println("Objectes Triangle");
        for(Triangle t: triangle10){
            System.out.println(t.toString());
        }
        System.out.println("");
        System.out.println("Objectes Rectangle");
        for(Rectangle r: rectangle10){
            System.out.println(r.toString());
        }
    }
}
