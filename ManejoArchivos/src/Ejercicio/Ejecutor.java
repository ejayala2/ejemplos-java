/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;


/**
 *
 * @author SALAS
 */
public class Ejecutor {
   public static void main( String args[] )
   {
      Calificaciones c1 = new Calificaciones();

      c1.abrir_archivo();
      c1.agregar_informacion();
      c1.cerrar_archivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto
