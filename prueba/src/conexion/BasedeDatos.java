/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author choqu_000
 * Clase de Conexion a MySQL
 * 
 */

//Librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class BasedeDatos {
 
    //Atributos
     
    private static Connection singleConn;
    private static Connection singleConnEstacion;
    private static Connection simpleConexion;
    private static Connection simpleConexionCombo;
    private static Connection simpleConexionComboseg;
    private static String stJDBCDiver;
    private static String stJDBCConnUrl;
    private static String stDBUserName;
    private static String stDBPassword;


    //Constructor
    private BasedeDatos() {
    }

    
     /*
     * Metodo donde se inicializa la base de datos
     * Este metodo tiene como parametros el driver la conexion a la base de datos
     * el loguin y el password
     * 
     */
    public static void inicializarBasedeDatos(String JDBCDiver, String JDBCConnUrl,
        String DBUserName, String DBPassword) {
        stJDBCDiver = JDBCDiver; // drivers
        stJDBCConnUrl = JDBCConnUrl; //direccion url
        stDBUserName = DBUserName; //usuario
        stDBPassword = DBPassword; // contraseÃ±a
     }

    /*
     * Metodo donde realiza la conexion a la base de datos y retorna una variable
     */
    public static Connection getConexion() throws Exception {
        if (singleConn == null) {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                singleConn = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }else {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                singleConn = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }
        return singleConn;
    }

    /*
     * Metodo donde realiza la conexion a la base de datos y retorna una variable
     */
    public static Connection getReConexion() throws Exception {
        if (simpleConexion == null) {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                simpleConexion = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }
        return simpleConexion;
    }

    
     /*
     * Metodo donde realiza la conexion a la base de datos y retorna una variable
     */
    public static Connection getReConexionCombo() throws Exception {
        if (simpleConexionCombo == null) {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                simpleConexionCombo = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        } else {
             try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                simpleConexionCombo = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }
        return simpleConexionCombo;
    }
    
      /*
     * Metodo donde realiza la conexion a la base de datos y retorna una variable
     */
    public static Connection getReConexionCombosegundo() throws Exception {
        if (simpleConexionComboseg == null) {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                simpleConexionComboseg = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }else{
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                simpleConexionComboseg = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConn );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }
        return simpleConexionComboseg;
    }
    
     public static Connection getConexionesEstacion() throws Exception {
        if (singleConnEstacion == null) {
            try {
                Class.forName(stJDBCDiver);
            } catch (java.lang.ClassNotFoundException e) {
                throw new Exception("ClassNotFoundException - " + e.getMessage());
            } catch (Exception ex) {
                throw ex;
            }
            try {
                singleConnEstacion = DriverManager.getConnection(stJDBCConnUrl, stDBUserName, stDBPassword);
                JOptionPane.showMessageDialog(null,"Base de datos conectada : " + singleConnEstacion );
//                singleConn.setAutoCommit(false);
            } catch (SQLException sqle) {
                throw new Exception("SQL Exception - " + sqle.getMessage());
                
            } catch (Exception ex2) {
                throw ex2;
                //JOptionPane.showMessageDialog(null,"Error de conexion : " + ex2);
            }
        }
        return singleConnEstacion;
    }
    
    
    
}
