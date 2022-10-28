/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyect;

/**
 *
 * @author Panda
 */
public class Proyect {

    public static void main(String[] args) {
        Conexion conexion=new Conexion();
        conexion.conectar();
        interfaz f = new interfaz();
        f.setVisible (true);
    }
    
}
