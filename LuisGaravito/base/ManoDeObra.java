/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuisGaravito.base;

import java.util.Date;

/**
 *
 * @author Luis Daniel Garavito
 */
public class ManoDeObra {
    
    //PROPIEDADES
    private Empleado trabajador;
    private Proyecto proyecto;
    private Date FechaInicio;
    private Date FechaFin;
    private String rol;
    
    //constructores
    public ManoDeObra(){
        
      
    }
    
    public ManoDeObra(Empleado e, Proyecto p){
        trabajador = e;
        proyecto = p;
    
    }
  
    
}
