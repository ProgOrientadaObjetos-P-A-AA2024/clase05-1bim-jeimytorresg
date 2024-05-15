/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion estudiante = new LibretaCalificacion(nombreEstudiante,
                notas);
        estudiante.establecerPromedio();
        estudiante.establecerPromedioCualitativo();
        /*
        si se comentan las lineas 20 y 21, o si no existieran, no se llamarian
        a los metodos correspondientes y por lo tanto los atributos promedio y
        promedio cualitativo no tendran ningun valor, y se imprimira el valor 
        que tienen por defecto
        */
        
        System.out.printf("%s\n", estudiante);
    }
}
