/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author vane_
 */


/*Examen teorico 3 unidad 
Gingerbread
Karen Vanessa Gil Nájera
Matricula: 20550352
*/
public class PROGRAMA1 extends ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        ArbolBinario arbolB = new ArbolBinario();

        String palabra = "";
        String continuar = "si";
        while (continuar.equalsIgnoreCase("Si")) {
            System.out.println("Ingresa la palabra que quieras: ");
            palabra = teclado.readLine();
            arbolB.add(palabra);
            System.out.println("¿Deseas agregar otro? (Sí/No)?");
            continuar = teclado.readLine();
        }

        Boolean bandera = true;
        while (bandera) {
            System.out.println("Selecciona una opcion: ");
            System.out.println("\nIngresa 1 para tipo de impresión PreOrder");
            System.out.println("\nIngresa 2 para tipo de impresión InOrder");
            System.out.println("\nIngresa 3 para tipo de impresión PostOrder");
            System.out.println("\nIngresa 4 para Borrar Nodo");
            
            int dato = Integer.parseInt(teclado.readLine());
            
            if (dato == 1 || dato == 2 || dato == 3 || dato == 4) { 
                bandera = false;
                switch (dato) {
                    case 1:
                        arbolB.printPreOrder();
                        break;

                    case 2:
                        arbolB.printInOrder();
                        break;

                    case 3:
                        arbolB.printPostOrder();
                        break;
                    case 4:
                        System.out.println("\nValor nodo:");
                        String valorNodo = teclado.readLine();
                        arbolB.callDelete(valorNodo);
                        arbolB.printPreOrder();
                        break;
                }
            } else {
                System.out.println("\nERROR: Selecciona una opcion del menu");
            }

        }

    }
}
