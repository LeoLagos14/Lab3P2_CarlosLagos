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

    public Mago(String tmagia, int HP,int CS, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso, String descripcion,String tpersonaje) {
        super(HP, AC, CS,years, nombre, raza, nacionalidad, tipoP, altura, peso, descripcion,tpersonaje);
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
        return super.toString() + "Mago{" + "tmagia=" + tmagia + '}';
    }
    
    
}//fin clase
