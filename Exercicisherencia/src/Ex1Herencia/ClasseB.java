/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Herencia;

/**
 *
 * @author super
 */
public class ClasseB extends ClasseA {

    int k;
    int variableOculta;
    
    public ClasseB(String cadena){
        System.out.println(cadena + ", estic en B");
    }
    
    public ClasseB(){        
        k=3;        
        i=1;
        j=5;
        super.variableOculta = 200;
        variableOculta = 100;
    }

    public ClasseB(int k, int i, int j) {        
        //super(i, j);
        //super.i = i;
        //super.j = j;
        this.k = k;
    }

    void mostrarValor() {
        System.out.println("k: " + k);
    }

    void suma() {
        System.out.println("i + j + k : " + (i + j + k));
    }
    
//    @Override
//    void mostrarValors() {
//        System.out.println("i, j y k: " + i + ", " + j + " " + k);
//    }
    
    //@Override
    void mostrarVariableOculta(){
        System.out.println("Variable oculta en A " + super.variableOculta);
        System.out.println("Variable oculta en B " + variableOculta);
    }
    
    void funcioEnB(String missatge){
        System.out.println(missatge + ", estic en B");
    }
}

