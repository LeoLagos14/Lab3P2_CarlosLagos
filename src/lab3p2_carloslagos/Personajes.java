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
public class Personajes {
    
    private int HP,AC,DG,years;
    private String nombre,raza,nacionalidad,tipoP,descripcion;
    double altura,peso;

    public Personajes() {
    }

    public Personajes(int HP, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso,String descripcion) {
        this.HP = HP;
        this.AC = AC;
        this.DG = DG;
        this.years = years;
        this.nombre = nombre;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        this.tipoP = tipoP;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getDG() {
        return DG;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
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
        return "Personajes{" + "HP=" + HP + ", AC=" + AC + ", DG=" + DG + ", years=" + years + ", nombre=" + nombre + ", raza=" + raza + ", nacionalidad=" + nacionalidad + ", tipoP=" + tipoP + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}//fin clase
