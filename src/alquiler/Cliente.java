/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author jriosaguilar
 */
public class Cliente {
    
    //Atributos
    private String nif;
    private String nombre;
    private String apellidos;
    
    //Metodos
    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    //Método para crear un cliente aleatorio. Será un constructor por defecto pero
    //creará un cliente aleatorio
    public Cliente(){
        Random aleatorio=new Random();
        
        char[] nif=new char[9];
        String[] nombre={"Raul", "Jose", "Juan", "Hector", "Daniel", "Alejandro", "Victor", "Ana", "Maria", "Paula", "Roberta", "Lucia", "Lidia"};
        String[] apellido={"Ramirez", "Rios", "Gonzalez", "Aguilar", "Garcia", "Lopez", "Ruiz", "Cabas", "Torres", "Bernal", "Sanchez", "Morales", "Sierra", "Perez"};
        int numAlea;
        
        //Entramos en un bucle for para seleccionar los numeros del nif. Al salir del bucle 
        //le damos una letra aleatoria
        for(int x=0;x<nif.length-1;x++){
            numAlea=aleatorio.nextInt(10)+48;
            nif[x]=(char) numAlea;
        }
        
        //Al ultimo hueco del array nif le asignamos una letra aleatoria
        int letraAlea;
        letraAlea=aleatorio.nextInt(25)+65;
        nif[8]=(char)letraAlea;
        
        this.nif=Arrays.toString(nif);
        
        
        
        //Elegimos un numero aleatorio para seleccionar el nombre y dos aleatorios para los dos apellidos
        int nom=aleatorio.nextInt(nombre.length-1);
        int ape1=aleatorio.nextInt(apellido.length-1);
        int ape2=aleatorio.nextInt(apellido.length-1);
        
        this.nombre=nombre[nom];
        this.apellidos=apellido[ape1]+apellido[ape2];
        
    }
    
    //Getters y setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
