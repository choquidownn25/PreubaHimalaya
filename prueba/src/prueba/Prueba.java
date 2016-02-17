/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import conexion.BasedeDatos;
import mdi.MDIApplicationPrueba;

/**
 *
 * @author choqu_000
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Llamamos a la clase conexion de la DB
        BasedeDatos.inicializarBasedeDatos("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost/prueba", "pruebas", "12345");
        
        
        //llamamos al objeto de la mdi de la prueba
        MDIApplicationPrueba objtoPrueba = new MDIApplicationPrueba(); //Instancia de clases
        objtoPrueba.show();
                
    }
    
}
