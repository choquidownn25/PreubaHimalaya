/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlcontrolprueba;

import datos.Prueba;
import javax.swing.JOptionPane;
import sql.SqlPrueba;

/**
 *
 * @author choqu_000
 */
public class SqlControlPrueba {
    
    //Constructor
    public SqlControlPrueba(){
        
    }
    
     //metodo si es valida la insercion
    public static boolean insertarpreuba(Prueba objprueba) throws Exception {
        //se crean los ojetos para la clase sql producto

        SqlPrueba objsqlaforo = new SqlPrueba();
        //Varialbe conde se ejecuta la insercion aceptada
        int filasAfectadas = objsqlaforo.InsertarPrueba(objprueba);
        //int filasAfectadas = objsqlproducto.insertarproducto(objProducto);
        JOptionPane.showMessageDialog(null, "Paso clase sqlaforocontrol : " + objprueba);
        return filasAfectadas > 0 ? true : false;
    }
    
    
public static boolean Actualizapreuba(Prueba objprueba) throws Exception {
        //se crean los ojetos para la clase sql producto

        SqlPrueba objsqlprueba = new SqlPrueba();
        //Varialbe conde se ejecuta la insercion aceptada
        int filasAfectadas = objsqlprueba.PruebaActulizar(objprueba);
        //int filasAfectadas = objsqlproducto.insertarproducto(objProducto);
        JOptionPane.showMessageDialog(null, "Paso clase sqlPruebcontrol : " + objprueba);
        return filasAfectadas > 0 ? true : false;
    }
    
    
}
