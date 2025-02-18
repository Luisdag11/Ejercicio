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
public class Documento {
    //PROPIEDADES
    private String codigo;
    private String descripcion;
    private String tipo;
    private Tarea tarea;
    private List<Version> listaDeVersiones;
    
    //CONSTRUCTORES
    public Documento (){
    
    }
    
    //CONSTRUCTOR CON PARAMETROS
    public Documento(String codigo, String desc){
        this.codigo = codigo;
        this.descripcion = desc;
    }
    
}
