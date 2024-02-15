/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4HerenciaAbstract;

/**
 *
 * @author super
 */
public class Rectangle extends Figura {

    private int base;
    private int altura;

    public Rectangle(int dimensio1, int dimensio2) {
        super(dimensio1, dimensio2);
        this.base = dimensio1;
        this.altura = dimensio2;
    }

    public Rectangle(int base, int altura, String colorInterior, String colorCantonada, int grosorCantonada) {
        super(base, base, colorInterior, colorCantonada, grosorCantonada);
        this.base = base;
        this.altura = altura;
        setArea();
        setPerimetre();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        sb.append("\n\t");
        sb.append(super.toString());
        return sb.toString();
    }

    public void metodeRectangle() {
        System.out.println("Crida al mètode rectangle.");
    }

    @Override
    public void setPerimetre() {
        this.perimetre = base * 2 + altura * 2;
    }

    @Override
    public void setArea() {
        this.area = base * altura;
    }

    @Override
    public void metodeAbstracteNoFinal() {
        System.out.println("Estic al mètode abstracte de la Classe Rectangle.");
    }

}
