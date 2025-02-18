/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuisGaravito.base;

import java.util.List;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Promotor extends Empleado{
    
    //PROPIEDADES
    private List<Proyecto> listaDeProyectos;
    
    //constructores
    public Promotor(){
        super(); //llama al constructor de Empleado 
    }
    
    public Promotor(String n, String a){
        super(n,a);
    }
    
}
