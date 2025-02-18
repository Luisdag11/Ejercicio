/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuisGaravito.base;

import java.util.Date;
import java.util.List;
/**
 *
 * @author Luis Daniel Garavito
 */
public class Empleado {
    
    //PROPIEDADES
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String telefono; 
    protected String email;
    protected Date fechaContrato;
    protected Empresa empresa;
    protected List<Proyecto> listaDeProyectos;
    protected List<Tarea> listaDeTareas;
    
    //constructor por defecto
    public Empleado(){
    
    }
    
    //constructor con parametros
    public Empleado(String nombre, String apellido ){
        this.nombre = nombre;
        this.apellidos = apellido;
    
    }
}
