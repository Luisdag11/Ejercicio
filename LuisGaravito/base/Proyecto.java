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
public class Proyecto {
    
    //PROPIEDADES
    private String nombreClave;
    private String denominacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Empresa empresa;
    private List<Empleado> listaDeEmpleados;
    private Promotor empleadoPromotor;
    private List<Tarea> listaDeTareas; 
    
    //constructores
    public Proyecto(){
    
    }
    
    public Proyecto(String nombreClave, String denominacion){
        this.nombreClave = nombreClave;
        this.denominacion = denominacion;
    }
}
