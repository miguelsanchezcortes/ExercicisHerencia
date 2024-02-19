/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2Herencia;

/**
 *
 * @author super
 */
public class Ex2 {
    public static void main(String[] args) {
        Embalatge[] embalatges = new Embalatge[4];

        Adreça origen = new Adreça("Juan", "Calle", "Pueblo", "Provincia", "12345");
        Adreça desti = new Adreça("Pepe", "Calle", "Pueblo", "Provincia", "54321");

        CaixaBasica cb1 = new CaixaBasica("Rojo", origen, desti);

        embalatges[0] = cb1;

        CaixaVariable cv1 = new CaixaVariable(10, 10, 10, "Azul", origen, desti);

        embalatges[1] = cv1;

        Sobre s1 = new Sobre(10, 10, "Verde", origen, desti);

        embalatges[2] = s1;

        Tub t1 = new Tub(5, 10, "Amarillo", origen, desti);

        embalatges[3] = t1;

        for (Embalatge embalatge : embalatges) {
            System.out.println(embalatge);
        }

    }
}
