/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carloslagos;

/**
 *
 * @author clago
 */
public class Mago extends Personajes{
    
    private String tmagia;

    public Mago() {
    }

    public Mago(String tmagia) {
        this.tmagia = tmagia;
    }

    public Mago(String tmagia, int HP, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso, String descripcion) {
        super(HP, AC, DG, years, nombre, raza, nacionalidad, tipoP, altura, peso, descripcion);
        this.tmagia = tmagia;
    }

    public String getTmagia() {
        return tmagia;
    }

    public void setTmagia(String tmagia) {
        this.tmagia = tmagia;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mago{" + "tmagia=" + tmagia + '}';
    }
    
    
}//fin clase
