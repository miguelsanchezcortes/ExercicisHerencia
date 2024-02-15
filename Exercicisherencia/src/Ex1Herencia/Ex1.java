/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Herencia;

/**
 *
 * @author super
 */
public class Ex1 {

    public static void main(String[] args) {
        ClasseA a = new ClasseA(1,2);
        ClasseB b = new ClasseB(4,5,6);

        //PAS 1
        //creem un objecte de la classe A, quins atributs podem veure? quins mètodes podem veure
        //a
        //creem un objecte de la classe B, quins atributs podem veure? quins mètodes podem veure
        //b
        
        //PAS 2
        //els atributs haurien de ser privats, no? si ho canviem que passa? I si utilitzem protected?
        
        
        //PAS 3
        //una classe pot tindre mètodes publics i privats, que passa amb els mètodes quant ho canviem?
        
        //PAS 4 utilitzem els mètodes dels objectes
        //a.mostrarValors();
        //a.funcioEnA("soc un objecte de la classe A");
        //b.mostrarValor();
        //b.mostrarValors();
        //b.funcioEnA("soc un objecte de la classe B");
        //b.funcioEnB("soc un objecte de la classe B");
        //b.suma();
        
        //PAS 5 Sobreescibim el mètode de A mostrarValors en B pq ha de ser diferent
        //a.mostrarValors();
        //b.mostrarValor();
        //b.mostrarValors();
        //b.suma();
        
        //PAS 5 Creació de referències a objectes, que podem fer amb objA??
        //ClasseA objA = new ClasseA();
        //objA = b;
        //objA.
        //que podem fer amb objB??
        //ClasseB objB = new ClasseB();
        //objB = a;
        //Creem un objecte de la classe pare però realment és de la classe filla?? Què podem fer??
        //ClasseA oA = new ClasseB();
        //oA.
        //((ClasseB) oA).i=0;
        //Creem un objecte de la classe filla però realment és de la classe pare?
        //ClasseB oB = new ClasseA();
        
        //PAS 6, ens hem deixat la variableOculta!!!! Què passa amb la variableOculta?
        //a = new ClasseA();
        //b = new ClasseB();
        //a.mostrarVariableOculta();
        //b.mostrarVariableOculta();
        
        
        //PAS 7, ens hem fixat quan es crea un objecte quin constructor es crida primer??
        //podem posar instruccions abans del super??
        //a = new ClasseA("Soc un objecte de la classe A");
        //b = new ClasseB("Soc un objecte de la classe B");
        
        //PAS FINAL
        //Creeu una nova ClasseC que accepta un paràmetre més (i,j,k,l), que hereta de Classe B
        //experimenteu que podeu fer amb els objectes
    }
}
