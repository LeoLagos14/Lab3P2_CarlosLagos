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
public class Picaro extends Personajes{
    
    private String tinstrumento;
    private int cantrobos;

    public Picaro() {
    }

    public Picaro(String tinstrumento, int cantrobos) {
        this.tinstrumento = tinstrumento;
        this.cantrobos = cantrobos;
    }

    public Picaro(String tinstrumento, int cantrobos, int HP, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso, String descripcion) {
        super(HP, AC, DG, years, nombre, raza, nacionalidad, tipoP, altura, peso, descripcion);
        this.tinstrumento = tinstrumento;
        this.cantrobos = cantrobos;
    }

    public String getTinstrumento() {
        return tinstrumento;
    }

    public void setTinstrumento(String tinstrumento) {
        this.tinstrumento = tinstrumento;
    }

    public int getCantrobos() {
        return cantrobos;
    }

    public void setCantrobos(int cantrobos) {
        this.cantrobos = cantrobos;
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
        return "Picaro{" + "tinstrumento=" + tinstrumento + ", cantrobos=" + cantrobos + '}';
    }
    
    
}//fin clase
