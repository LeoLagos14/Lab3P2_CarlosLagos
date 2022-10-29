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
public class Barbaro extends Personajes{
    
    private String tarma;
    private int xp;

    public Barbaro() {
    }

    public Barbaro(String tarma, int xp) {
        this.tarma = tarma;
        this.xp = xp;
    }

    public Barbaro(String tarma, int xp, int HP,int CS, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso, String descripcion, String tpersonaje) {
        super(HP,CS, AC,years, nombre, raza, nacionalidad, tipoP, altura, peso, descripcion,tpersonaje);
        this.tarma = tarma;
        this.xp = xp;
    }

    public String getTarma() {
        return tarma;
    }

    public void setTarma(String tarma) {
        this.tarma = tarma;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
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
        return "Barbaro{" + "tarma=" + tarma + ", xp=" + xp + '}';
    }
    
    
}//fin clase
