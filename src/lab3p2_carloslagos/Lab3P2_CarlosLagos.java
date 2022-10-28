/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carloslagos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clago
 */
public class Lab3P2_CarlosLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        ArrayList personajes = new ArrayList();
        
        boolean centinela = true;
 
        
        while(centinela == true){
            
            
            System.out.println("Laboratorio 3");
            System.out.println("1) Agregar Personaje");
            System.out.println("2) Modificar personajes");
            System.out.println("3) Ver atributos de un personaje");
            System.out.println("4) Eliminar Personajes");
            System.out.println("5) Combate");
            System.out.println("6) Salir");
            System.out.println("Ingrese la opcion: ");
            int opcion = lea.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.println("--- Agregar Personaje ---");
                    
                    boolean centinela1 = true;
                    while (centinela1 == true) {                        
                        System.out.println("Elija el tipo de personaje con el que desea jugar: ");
                        System.out.println("1) Clerigo");
                        System.out.println("2) Barbaro");
                        System.out.println("3) Mago");
                        System.out.println("4) Picaro");
                        System.out.println("Ingrese el numero donde esta el tipo que desea: ");
                        int opcion1 = lea.nextInt();
                        

                        switch (opcion1) {
                            case 1: {
                                
                                System.out.println("Clerigo");
                                      
                                centinela1 = false;
                            }//fin 1
                            break;

                            case 2: {
                               
                                System.out.println("Barbaro");
                                centinela1 = false;
                            }//fin 1
                            break;

                            case 3: {
                                System.out.println("Mago");
                                centinela1 = false;
                            }//fin 1
                            break;

                            case 4: {
                                System.out.println("Pícaro");
                                centinela1 = false;  
                            }//fin 1
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela1 = true;

                        }//fin switch
                    }//fin while
                    
                    
                    
                    System.out.println("Ingrese el nombre de su Personaje: ");
                    String nombre = lea.next();
                    
                    String raza = "";
                    boolean centinela2 = true;
                    while (centinela2 == true) {                        
                        System.out.println("Elija la raza para su Personajee: ");
                        System.out.println("1) Mediano");
                        System.out.println("2) Enano");
                        System.out.println("3) Elfo");
                        System.out.println("4) Humano");
                        System.out.println("Ingrese el numero donde esta la raza que desea: ");
                        int opcion3 = lea.nextInt();
                        
                        switch (opcion3) {
                            case 1: {
                                raza = "Mediano";
                                centinela2 = false;
                            }//fin 1
                            break;

                            case 2: {
                                raza = "Enano";
                                centinela2 = false;
                            }//fin 2
                            break;

                            case 3: {
                                raza = "Elfo";
                                centinela2 = false;
                            }//fin 3
                            break;

                            case 4: {
                                raza = "Humano";
                                centinela2 = false;  
                            }//fin 4
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela2 = true;

                        }//fin switch
                    }//fin while
                    
                    
                    System.out.println("Ingrese la estatura: ");
                    double altura = lea.nextInt();
                    
                    System.out.println("Ingrese el peso: ");
                    double peso = lea.nextDouble();
                    
                    System.out.println("Ingrese los años que tiene su personaje: ");
                    int years = lea.nextInt();
                    
                    String desc;
                    System.out.println("Ingrese la descripcion de su personaje: ");
                    lea.nextLine();
                    desc = lea.nextLine();
                    
                    String  nacionalidad = "";
                    boolean centinela3 = true;
                    while (centinela3 == true) {                        
                        System.out.println("Elija la nacionalidad para su Personaje: ");
                        System.out.println("1) Mediano");
                        System.out.println("2) Enano");
                        System.out.println("3) Elfo");
                        System.out.println("4) Humano");
                        System.out.println("Ingrese el numero donde esta la nacionalidad que desea: ");
                        int opcion3 = lea.nextInt();
                        
                        switch (opcion3) {
                            case 1: {
                                nacionalidad = "Norfair";
                                centinela3 = false;
                            }//fin 1
                            break;

                            case 2: {
                                nacionalidad = "Brinstar";
                                centinela3 = false;
                            }//fin 2
                            break;

                            case 3: {
                                nacionalidad = "Maridia";
                                centinela3 = false;
                            }//fin 3
                            break;

                            case 4: {
                                nacionalidad = "Zebes";
                                centinela3 = false;  
                            }//fin 4
                            break;
                            
                            case 5: {
                                nacionalidad = "Crateria";
                                centinela3 = false;  
                            }//fin 5
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela2 = true;

                        }//fin switch
                    }//fin while
                    
                    String  tipoP = "";
                    boolean centinela4 = true;
                    while (centinela3 == true) {                        
                        System.out.println("Elija la nacionalidad para su Personaje: ");
                        System.out.println("1) Mediano");
                        System.out.println("2) Enano");
                        System.out.println("3) Elfo");
                        System.out.println("4) Humano");
                        System.out.println("Ingrese el numero donde esta la nacionalidad que desea: ");
                        int opcion3 = lea.nextInt();
                        
                        switch (opcion3) {
                            case 1: {
                                tipoP = "Lead";
                                centinela4 = false;
                            }//fin 1
                            break;

                            case 2: {
                                tipoP = "Support";
                                centinela4 = false;
                            }//fin 2
                            break;

                            case 3: {
                                tipoP = "Offensive";
                                centinela4 = false;
                            }//fin 3
                            break;

                            case 4: {
                                tipoP = "Spammer";
                                centinela4 = false;  
                            }//fin 4
                            break;
                            
                            case 5: {
                                tipoP = "Tank";
                                centinela4 = false;  
                            }//fin 5
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela2 = true;

                        }//fin switch
                    }//fin while
                    
                    
                    
                    
                    
                }//fin caso 1
                break;
                
                case 2:{
                   
                }//fin caso 2
                break;
                
                case 3:{
                  
                    
                }//fin caso 3
                break;
                
                case 4:{
                    
                }//fin caso 4
                break;
                
                case 5:{
                    
                }//fin caso 5
                break;
                
                case 6:{
                    centinela = false;
                }//fin 5
                break;
                default:
            }//fin switch
            
            
        }//fin while
        
        
        
        
    }//fin main  
}//fin clase
