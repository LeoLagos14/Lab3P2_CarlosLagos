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
public class Clerigo extends Personajes{
    
    
    private String creencia;
    private String invocacion;

    public Clerigo(String creencia, String invocacion) {
        this.creencia = creencia;
        this.invocacion = invocacion;
    }

    public Clerigo(String creencia, String invocacion, int HP, int AC, int DG, int years, String nombre, String raza, String nacionalidad, String tipoP, double altura, double peso,String descripcion) {
        super(HP, AC, DG, years, nombre, raza, nacionalidad, tipoP, altura, peso,descripcion);
        this.creencia = creencia;
        this.invocacion = invocacion;
    }

    
    public String getCreencia() {
        return creencia;
    }

    public void setCreencia(String creencia) {
        this.creencia = creencia;
    }

    public String getInvocacion() {
        return invocacion;
    }

    public void setInvocacion(String invocacion) {
        this.invocacion = invocacion;
    }

    @Override
    public String toString() {
        return "Clerigo{" + "creencia=" + creencia + ", invocacion=" + invocacion + '}';
    }
    
    
}//fin clase
