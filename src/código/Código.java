/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package código;

import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class Código {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaración
        ArrayList<String> list;

        ArrayList<String> cadena = new ArrayList<>();
        // Crear instancia
        list = new ArrayList<>();

        //Agregar elementos
        list.add("Hola");
        list.add("como");
        list.add("estas");

        for (int i = 0; i < list.size(); i++) {

            System.out.println("-->" + list.get(i));

        }
        //Eliminar elementos

        System.out.println("");
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {

            System.out.println("--+" + list.get(i));
        }

    }
}
