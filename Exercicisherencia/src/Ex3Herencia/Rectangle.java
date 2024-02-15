/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3Herencia;


/**
 *
 * @author super
 */
public class Rectangle extends Figura{
    private int base;
    private int altura;

    public Rectangle(int dimensio1, int dimensio2) {
        super(dimensio1, dimensio2);
        super.setArea(base*altura);
        super.setPerimetre(base*2+altura*2);
        this.base = dimensio1;        
        this.altura = dimensio2;        
    }

    public Rectangle(int base,int altura, String colorInterior, String colorCantonada, int grosorCantonada){
        super(base, base, colorInterior, colorCantonada, grosorCantonada);
        super.setArea(base*altura);
        super.setPerimetre(base*2+altura*2);
        this.base = base; 
        this.altura = altura;  
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
    public int getArea(){
        System.out.println("Estic en la classe Quadrat");
        return super.getArea();
    }
    
    @Override
    public int getPerimetre(){
        System.out.println("Estic en la classe Quadrat");
        return super.getPerimetre();
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

   public void metodeRectangle(){
        System.out.println("Crida al mètode rectangle.");
    }
    
    
}
