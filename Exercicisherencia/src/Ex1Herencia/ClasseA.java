/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Herencia;

/**
 *
 * @author super
 */
public class ClasseA {

    int i;
    int j;
    int variableOculta;
    
    public ClasseA(String cadena){
        System.out.println(cadena + ", estic en A");
    }

    public ClasseA(){
        i=0;
        j=0;
        variableOculta = 0;
    }
    
    public ClasseA(int i, int j) {
        this.i = i;
        this.j = j;
    }   

    void mostrarValors() {
        System.out.println("i y j: " + i + " " + j);
    }
    
    void mostrarVariableOculta(){
        System.out.println("Variable oculta en A " + variableOculta);
    }
    
    void funcioEnA(String misstage){
        System.out.println(misstage + ", estic en A");
    }
}
