/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5HerenciaAbstractInterface;

/**
 *
 * @author super
 */
public class Triangle extends FiguraGeometrica implements InterfaceOptions {

    private int base;
    private int altura;

    public Triangle(int base, int altura) {
        super(base, altura);
        this.base = base;
        this.altura = altura;
    }

    public Triangle(int base, int altura, String colorInterior, String colorCantonada, int grosorCantonada) {
        super(base, altura, colorInterior, colorCantonada, grosorCantonada);

        this.base = base;
        this.altura = altura;
    }

    public int getLongitudCostat() {
        return base;
    }

    public void setLongitudCostat(int longitudCostat) {
        this.base = longitudCostat;
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
        sb.append("Triangle{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        sb.append("\n\t");
        sb.append(super.toString());
        return sb.toString();
    }

    public void metodeTriangle() {
        System.out.println("Crida al mètode triangle.");
    }


    @Override
    public void estableixPerimetre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estableixPerimetre'");
    }

    @Override
    public void estableixArea() {
        // TODO Auto-generated method stub
        area = (base * altura) / 2;
    }

    @Override
    public void getMyClass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMyClass'");
    }

    @Override
    public double costEuroArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'costEuroArea'");
    }

    @Override
    public void posicio(int posicio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'posicio'");
    }

}
