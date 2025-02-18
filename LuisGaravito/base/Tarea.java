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
public class Tarea {
    
    //PROPIEDADES
    private String descripcion;
    private String tipo;
    private Date fechaInicioEstimado;
    private Date fechaInicioReal;
    private int duracionEstimada;
    private int duracionReal;
    private List<Empleado> listaDeEmpleados;
    private Proyecto proyecto;
    private List<Documento> listaDeDocumentos;
    
    //constructores 
    public Tarea(){
    
    }
    
    public Tarea(String d, String t ){
        descripcion = d;
        tipo = t;
    }
    
}
