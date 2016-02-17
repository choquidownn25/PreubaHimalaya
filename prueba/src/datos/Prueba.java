/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author choqu_000
 */
public class Prueba {
    
//Atributos    
private int  id_alumno;
private String codigo_alumno;
private String nombre_alumno;
private String descripcion_alumno;

//Constructor
public Prueba(){}

//Propiedad o Encapsulamiento
    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(String codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getDescripcion_alumno() {
        return descripcion_alumno;
    }

    public void setDescripcion_alumno(String descripcion_alumno) {
        this.descripcion_alumno = descripcion_alumno;
    }


    
}
