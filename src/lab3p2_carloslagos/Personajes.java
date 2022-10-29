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
    
    protected int HP,CS,AC,years;
    protected String nombre,raza,nacionalidad,tipoP,descripcion,tpersonaje;
    protected double altura,peso;

    public Personajes() {
    }

    public Personajes(int HP,int CS, int AC, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso,String descripcion,String tpersonaje) {
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
        this.years = years;
        this.nombre = nombre;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        this.tipoP = tipoP;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
        this.tpersonaje = tpersonaje;
        
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
    public int getCS() {
        return AC;
    }

    public void setCS(int CS) {
        this.CS = CS;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTpersonaje() {
        return tpersonaje;
    }

    public void setTpersonaje(String tpersonaje) {
        this.tpersonaje = tpersonaje;
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
        return "Personajes{" + "HP=" + HP + ", CS=" + CS + ", AC=" + AC + ", years=" + years + ", nombre=" + nombre + ", raza=" + raza + ", nacionalidad=" + nacionalidad + ", tipoP=" + tipoP + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}//fin clase
