/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carloslagos;

import java.util.ArrayList;
import java.util.Random;
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
        Random r = new Random();
        ArrayList personajes = new ArrayList();
        int HP = 0,AC = 0,years = 0,CS = 0,xp = 0,cantrobos = 0;
        String nombre = "",raza = "",nacionalidad = "",tipoP = "",descripcion = "",tpersonaje = "",arma = "",creencia = "",invocacion = "",tinstrumento = "",tmagia = "";
        double altura = 0.0,peso = 0.0;
        int opcion1 = 0;
        
        int DG = 0;
        
        
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
                        System.out.println("Elija la clase de personaje con el que desea jugar: ");
                        System.out.println("1) Clerigo");
                        System.out.println("2) Barbaro");
                        System.out.println("3) Mago");
                        System.out.println("4) Picaro");
                        System.out.println("Ingrese el numero donde esta la clase de personaje que desea: ");
                        opcion1 = lea.nextInt();
                        

                        switch (opcion1) {
                            case 1: {
                                
                                System.out.println("Clerigo");
                                
                                System.out.println("Ingrese el Dios/demonio del cual su personaje es creyente: ");
                                lea.nextLine();
                                creencia = lea.nextLine();
                                System.out.println(creencia);
                               
                                System.out.println("Ingrese el tipo de invocacion: ");
                                invocacion = lea.nextLine();
                                System.out.println(invocacion);
                                CS = 97;
                                AC = 40;
                                System.out.println("El tipo de personaje del Clerigo es Lead");
                                tpersonaje = "Lead";
                                
                                centinela1 = false;
                            }//fin 1
                            break;

                            case 2: {
                               
                                System.out.println("Barbaro");
                                arma = "";
                                boolean centinela4 = true;
                                while (centinela4 == true) {
                                    System.out.println("Tipos de arma");
                                    System.out.println("1) Pesada");
                                    System.out.println("2) Ligera");
                                    System.out.println("3) Escudo");
                                    System.out.println("Ingrese el numero del arma que quiere para su personaje: ");
                                    int oparma = lea.nextInt();

                                    switch (oparma) {
                                        case 1: {
                                            arma = "Pesada";
                                            centinela4 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            arma = "Ligera";
                                            centinela4 = false;
                                        }//fin 2
                                        break;

                                        case 3: {
                                            arma = "escudo";
                                            centinela4 = false;
                                        }//fin 3
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela4 = true;
                                    }//fin switch
                                }//fin while
   
                                centinela1 = false;
                                System.out.println("Ingrese el nivel de xp: ");
                                xp = lea.nextInt();
                                CS = 93;
                                AC = 65;
                                tpersonaje = "";
                                boolean centinela7 = true;
                                while (centinela7 == true) {
                                    System.out.println("Tipos de personajes para Barbaros");
                                    System.out.println("1) Lead");
                                    System.out.println("2) Support");
                                    System.out.println("3) Offensive");
                                    System.out.println("Ingrese el tipo de personajes que quiere para su personaje: ");
                                    int tp = lea.nextInt();

                                    switch (tp) {
                                        case 1: {
                                            tpersonaje = "Lead";
                                            centinela7 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            tpersonaje = "Support";
                                            centinela7 = false;
                                        }//fin 2
                                        break;

                                        case 3: {
                                            tpersonaje = "Offensive";
                                            centinela7 = false;
                                        }//fin 3
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela7 = true;
                                    }//fin switch
                                }//fin while
                            }//fin 2
                            break;

                            case 3: {
                                System.out.println("Mago");
                                tmagia = "";
                                boolean centinela5 = true;
                                while (centinela5 == true) {
                                    System.out.println("Tipos de Magia");
                                    System.out.println("1) Mago Blanco");
                                    System.out.println("2) Mago Negro");
                                    System.out.println("3) Sanador");
                                    System.out.println("Ingrese el numero del tipo de magia que quiere para su personaje: ");
                                    int oparma = lea.nextInt();

                                    switch (oparma) {
                                        case 1: {
                                            tmagia = "Mago Blanco";
                                            centinela5 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            tmagia = "Mago Negro";
                                            centinela5 = false;
                                        }//fin 2
                                        break;

                                        case 3: {
                                            tmagia = "Sanador";
                                            centinela5 = false;
                                        }//fin 3
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela5 = true;
                                    }//fin switch
                                }//fin while
                                
                                centinela1 = false;
                                CS = 101;
                                AC = 20;
                                tpersonaje = "";
                                boolean centinela8 = true;
                                while (centinela8 == true) {
                                    System.out.println("Tipos de personajes para Magos");
                                    System.out.println("1) Support");
                                    System.out.println("2) Tank");
                                    System.out.println("Ingrese el tipo de personajes que quiere para su personaje: ");
                                    int tp = lea.nextInt();

                                    switch (tp) {
                                        case 1: {
                                            tpersonaje = "Support";
                                            centinela8 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            tpersonaje = "Tank";
                                            centinela8 = false;
                                        }//fin 2
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela8 = true;
                                    }//fin switch
                                }//fin while
                            }//fin 3
                            break;

                            case 4: {
                                System.out.println("Pícaro");
                                tinstrumento = "";
                                boolean centinela6 = true;
                                while (centinela6 == true) {
                                    System.out.println("Tipos de Instrumentos");
                                    System.out.println("1) Amuleto");
                                    System.out.println("2) Arma");
                                    System.out.println("3) Piedra Antigua");
                                    System.out.println("Ingrese el numero del tipo de instrumento que quiere para su personaje: ");
                                    int oinstrumento = lea.nextInt();

                                    switch (oinstrumento) {
                                        case 1: {
                                            tinstrumento = "Amuleto";
                                            centinela6 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            tinstrumento = "Arma";
                                            centinela6 = false;
                                        }//fin 2
                                        break;

                                        case 3: {
                                            tinstrumento = "Piedra Antigua";
                                            centinela6 = false;
                                        }//fin 3
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela6 = true;
                                    }//fin switch
                                }//fin while
                                
                                centinela1 = false;
                                
                                System.out.println("Ingrese la cantidad de robos: ");
                                cantrobos = lea.nextInt();
                                CS = 80;
                                AC = 50;
                                tpersonaje = "";
                                boolean centinela9 = true;
                                while (centinela9 == true) {
                                    System.out.println("Tipos de personajes para Picaros");
                                    System.out.println("1) Spammer");
                                    System.out.println("2) Tank");
                                    System.out.println("Ingrese el tipo de personajes que quiere para su personaje: ");
                                    int tp = lea.nextInt();

                                    switch (tp) {
                                        case 1: {
                                            tpersonaje = "Spammer";
                                            centinela9 = false;
                                        }//fin 1
                                        break;

                                        case 2: {
                                            tpersonaje = "Tank";
                                            centinela9 = false;
                                        }//fin 2
                                        break;

                                        default:
                                            System.out.println("Opcion no disponible");
                                            centinela9 = true;
                                    }//fin switch
                                }//fin while
                                
                            }//fin 4
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela1 = true;

                        }//fin switch
                    }//fin while
                    
                    
                    
                    System.out.println("Ingrese el nombre de su Personaje: ");
                    nombre = lea.next();
                    
                    raza = "";
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
                                HP = 50 + r.nextInt(10);
                                centinela2 = false;
                            }//fin 1
                            break;

                            case 2: {
                                raza = "Enano";
                                HP = 80 + r.nextInt(20);
                                centinela2 = false;
                            }//fin 2
                            break;

                            case 3: {
                                raza = "Elfo";
                                HP = 50 + r.nextInt(20);
                                centinela2 = false;
                            }//fin 3
                            break;

                            case 4: {
                                raza = "Humano";
                                HP = 40 + r.nextInt(35);
                                centinela2 = false;  
                            }//fin 4
                            break;
                            
                            default:
                                System.out.println("Opcion no disponible");
                                centinela2 = true;

                        }//fin switch
                    }//fin while
                    
                    
                    System.out.println("Ingrese la estatura: ");
                    altura = lea.nextInt();
                    
                    System.out.println("Ingrese el peso: ");
                    peso = lea.nextDouble();
                    
                    System.out.println("Ingrese los años que tiene su personaje: ");
                    years = lea.nextInt();
                    
                    String desc;
                    System.out.println("Ingrese la descripcion de su personaje: ");
                    lea.nextLine();
                    desc = lea.nextLine();
                    
                    nacionalidad = "";
                    boolean centinela3 = true;
                    while (centinela3 == true) {                        
                        System.out.println("Elija la nacionalidad para su Personaje: ");
                        System.out.println("1) Norfair");
                        System.out.println("2) Brinstar");
                        System.out.println("3) Maridia");
                        System.out.println("4) Zebes");
                        System.out.println("5) Crateria");
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
                    
                    tipoP = "";
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
                    
                    if (opcion1 == 1) {
                        personajes.add(new Clerigo(creencia,invocacion,HP,CS,AC,DG,years,nombre,raza,nacionalidad,tipoP,altura,peso,descripcion,tpersonaje));
                        System.out.println("Se agrego correctamente");
                    }else if (opcion == 2) {
                        personajes.add(new Barbaro(arma,xp,HP,CS,AC,DG,years,nombre,raza,nacionalidad,tipoP,altura,peso,descripcion,tpersonaje));
                        System.out.println("Se agrego correctamente");
                    }else if (opcion == 3) {
                        personajes.add(new Mago(tmagia,HP,CS,AC,DG,years,nombre,raza,nacionalidad,tipoP,altura,peso,descripcion,tpersonaje));
                        System.out.println("Se agrego correctamente");
                    }else if (opcion == 4) {
                        personajes.add(new Picaro(tinstrumento,cantrobos,HP,CS,AC,DG,years,nombre,raza,nacionalidad,tipoP,altura,peso,descripcion,tpersonaje));
                        System.out.println("Se agrego correctamente");
                    }
                    
                    
                    
                }//fin caso 1
                break;
                
                case 2:{
                   System.out.println("--- Modificar Personaje ---");
                   
                    System.out.println("Ingrese la posicion del personaje a modificar: ");
                    int pos = lea.nextInt();
                    
                    if (pos > 0 && pos <= personajes.size() - 1) {
                        System.out.println("1) Nombre");
                        System.out.println("2) Raza");
                        System.out.println("3) Estatura");
                        System.out.println("4) Peso");
                        System.out.println("5) Años");
                        System.out.println("6) Descripcion");
                        System.out.println("7) Nacionalidad");
                        System.out.println("--- Cambio Atributos de las clases de Personajes ---");
                        if (personajes.get(pos) instanceof Clerigo) {
                            System.out.println("8) Cambiar Dios/Demonio");
                            System.out.println("9) Cambiar tipo de invocacion");
                        }
                        
                        System.out.println("10) Nombre");
                        System.out.println("11) Nombre");
                        System.out.println("12) Nombre");
                        System.out.println("13) Nombre");
                        System.out.println("14) Nombre");
                        System.out.println("15) Nombre");
                    }else{//fin if pos
                        System.out.println("No existe ese personaje");
                    }
                }//fin caso 2
                break;
                
                case 3:{
                    System.out.println("Listar los Personajes");
                    String listar = "";
                    for (Object t : personajes) {
                        if (t instanceof Personajes) {
                            listar += personajes.indexOf(t) + " - " + t + "\n";//get class se puede usar tambien
                        }

                    }
                    System.out.println(listar);
                    System.out.println();
                    System.out.println();
                    
                }//fin caso 3
                break;
                
                case 4:{
                    System.out.println("--- Eliminar Personaje ---");
                    System.out.println("Ingrese la posicion de la lista de personajes para borrar: ");
                    int posicion = lea.nextInt();
                    
                    if (posicion > 0 && posicion <= personajes.size() - 1) {
                        personajes.remove(posicion);
                        System.out.println("Se elimino exitosamente!");
                    }else{
                        System.out.println("No existe ese personaje");
                    }
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
