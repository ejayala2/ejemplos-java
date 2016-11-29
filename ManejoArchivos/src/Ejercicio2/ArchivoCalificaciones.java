/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class ArchivoCalificaciones {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("calificaciones2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        double n1 = 0, n2 = 0;
        double promedios, mejor=0;
        String nombres, apellidos;
        int valor = 0, valores=0;
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                 //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                //valor = Integer.parseInt(linea_partes.get(0));
                nombres = linea_partes.get(0);
                apellidos = linea_partes.get(1);
                n1 = Double.parseDouble(linea_partes.get(2));
                n2 = Double.parseDouble(linea_partes.get(3));
                promedios = (n1 + n2)/2;
                System.out.println("Promedio de: "+nombres+" "+apellidos+" es: "+promedios);
                if(promedios > mejor){
                    mejor = promedios;
                }
            } // fin de while
            System.out.println("El mejor promedio es del estudiante "+mejor);
//            System.out.println("Suma valores: "+suma);
//            System.out.println("Suma total: "+promedios);
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto
