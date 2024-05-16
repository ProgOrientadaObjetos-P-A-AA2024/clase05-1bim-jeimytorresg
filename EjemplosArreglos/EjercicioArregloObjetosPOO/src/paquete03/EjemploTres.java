/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación"), 
            new Calificacion(9, "Electrónica")};
        /*
        Dentro del arreglo de tipo calificacion, se estan asignando directamente
        valores dentro del arreglo. estos objetos son anonimos y solo pueden
        ser llamados por el nombre del arreglo y la posicion en donde se 
        encuentre el objeto
        */
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
