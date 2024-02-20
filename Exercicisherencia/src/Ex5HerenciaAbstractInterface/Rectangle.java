/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5HerenciaAbstractInterface;

/**
 *
 * @author super
 */
public class Rectangle extends FiguraGeometrica implements InterfaceOptions {
    private int base;
    private int altura;

    public Rectangle(int dimensio1, int dimensio2, int base, int altura) {
        super(dimensio1, dimensio2);
        this.base = base;
        this.altura = altura;
    }

    public Rectangle(int dimensio1, int dimensio2, String colorInterior, String colorCantonada, int grosorCantonada,
            int base, int altura) {
        super(dimensio1, dimensio2, colorInterior, colorCantonada, grosorCantonada);
        this.base = base;
        this.altura = altura;
    }

    

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void estableixPerimetre() {
        // TODO Auto-generated method stub
        perimetre = 2 * (base + altura);
        throw new UnsupportedOperationException("Unimplemented method 'estableixPerimetre'");
    }

    @Override
    public void estableixArea() {
        // TODO Auto-generated method stub
        area = base * altura;
        throw new UnsupportedOperationException("Unimplemented method 'estableixArea'");
    }

    @Override
    public void getMyClass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMyClass'");
    }

    @Override
    public double costEuroArea() {
        // TODO Auto-generated method stub

        return area * EURO;
    }

    @Override
    public void posicio(int posicio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'posicio'");
    } // extends FiguraGeometrica implements InterfaceOptions{

    // Completar esta classe

}
