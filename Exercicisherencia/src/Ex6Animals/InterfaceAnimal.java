/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ex6Animals;

/**
 *
 * @author super
 */
public interface InterfaceAnimal {

    //mètodes comuns a tots els animals
    public void menja(String menjar);
    
    public void dorm();

    //mètode diferent perquè cada animal pot jugar diferent
    public void juga();

    public void getDutxa();
}
