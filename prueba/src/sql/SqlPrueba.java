/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author choqu_000
 * 
 * Clase donde esta el Sql de la prueba
 * 
 */

import conexion.BasedeDatos;
import datos.Prueba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SqlPrueba {
    
    
    
    
     //metodo donde se realiza las pruebas pasando como parametros
    //de la clase prueba
    //este a suvez se comvierte en un objeto que pasa como parametros a este metodo
    private Connection conn = null; //conexion
    private PreparedStatement ps = null; //
    private Object[][] arAforo = null;

    //metodo para insertar Aforo
    public int InsertarPrueba(Prueba objetoPrueba) throws Exception {
        int filasAfectadas = 0;

        PreparedStatement pss = null;
        Connection conn = null;//no hubo errores de validacion

        try {


            //Primero se conecta a DB
            conn = BasedeDatos.getConexion();
            //Sentencia SQL para insertar
            String sql = "INSERT INTO alumno (codigo_alumno,  nombre_alumno, descripcion_alumno) VALUES (?,?,?)";
            //prepara la sentencia en a conexion y la ejecuta
            pss = conn.prepareStatement(sql);

            //pasa los parametros
            //getPs().setString(1, (objProducto.getNombre()));
            /*
             * ps.setInt(1, new Integer(obEmpleado.getNumeroIdentificacion()));
             * ps.setString(2, obEmpleado.getNombres());
             */
            pss.setString(1, (objetoPrueba.getCodigo_alumno()));
            JOptionPane.showMessageDialog(null, objetoPrueba.getCodigo_alumno());

            pss.setString(2, (objetoPrueba.getNombre_alumno()));
            JOptionPane.showMessageDialog(null, objetoPrueba.getNombre_alumno());

            pss.setInt(3, new Integer(objetoPrueba.getDescripcion_alumno()));
            JOptionPane.showMessageDialog(null, objetoPrueba.getDescripcion_alumno());


            JOptionPane.showMessageDialog(null, "Pasa clase Prueba SQL : " + sql);

            //ResultSet rs = ps.executeQuery();
            //ps.executeUpdate();
            filasAfectadas = pss.executeUpdate();

        } catch (Exception e) { // excepciones
            throw e;
        } finally {
            if (pss != null) { //si es diferente de null
                pss.close(); // se realiza cierre
                pss = null; //pasa nulo
            }

        }
        return filasAfectadas;

    }

    
    //Actuliza los datos de la tabla Aforo
    public int PruebaActulizar(Prueba objactualizarPrueba) throws Exception {
        int resultado = 0;
        try {

            setConn(BasedeDatos.getConexion()); //Conexion a base de datos

            //Sentencia SQL
            String sqlsp = "update alumno "
                    + " set id_alumno = ?,"
                    + " nombre_alumno = ?, "                   
                    + " descripcion_alumno = ? "
                    + " where codigo_alumno = ?";
            ps = conn.prepareStatement(sqlsp);//prepara nuestra sentencia SQL

            ps.setInt(1, objactualizarPrueba.getId_alumno()); //dato del primer campo de la tabla
            ps.setString(2, objactualizarPrueba.getNombre_alumno()); //dato del segundo campo de la tabla

            ps.setString(3, objactualizarPrueba.getDescripcion_alumno()); //dato del segundo campo de la tabla
            ps.setString(4, objactualizarPrueba.getCodigo_alumno());
            resultado = ps.executeUpdate(); // Ejecuta consulta

        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultado; //retorna
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn; //retorna la conexion
    }

    /**
     * @return the ps
     */
    public PreparedStatement getPs() {
        return ps;
    }
    
    
}
