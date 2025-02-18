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
public class Empresa {
    private String nit;
    private String nombre;
    private String tipo;
    private String web;
    private int telefono;
    private String email;
    private String direccion;
    private List<Empleado> listaDeEmpleados;
    private List <Proyecto> listaDeProyectos;
    
    //Construcotor por defecto, no tiene parametros 
    public Empresa(){
    
    }
    
    public Empresa(String nit, String nombre){
        this.nit = nit;
        this.nombre = nombre;
    }
}
