/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
   public static void main( String args[] )
   {
      LeerEstudiantes e1 = new LeerEstudiantes();
        e1.abrirArchivo();
        e1.leer_informacion();
        e1.cerrarArchivo();
   } // fin de main
}
