/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3Herencia;


/**
 *
 * @author super
 */
public class Triangle extends Figura{
    private int base;
    private int altura;

    public Triangle(int base, int altura) {
        super(base, altura);
        double calculPerimetre = base + altura + Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        super.setPerimetre((int) calculPerimetre);
        this.base = base; 
        this.altura = altura;                
    }

    public Triangle(int base, int altura, String colorInterior, String colorCantonada, int grosorCantonada){
        super(base, altura, colorInterior, colorCantonada, grosorCantonada);
        super.setArea(base*altura/2);
        double calculPerimetre = base + altura + Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        super.setPerimetre((int) calculPerimetre);
        this.base = base; 
        this.altura = altura;  
    }

    public int getLongitudCostat() {
        return base;
    }

    public void setLongitudCostat(int longitudCostat) {
        this.base = longitudCostat;
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
        sb.append("Triangle{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        sb.append("\n\t");
        sb.append(super.toString());
        return sb.toString();
    }

    public void metodeTriangle(){
        System.out.println("Crida al mètode triangle.");
    }
    
    
    
}
