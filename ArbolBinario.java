/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author vane_
 */

/*Examen teorico 3 unidad 
Gingerbread
Karen Vanessa Gil Nájera
Matricula: 20550352
*/
public class ArbolBinario {

    private Nodo ruta;

    public ArbolBinario() {
        this.ruta = null;
    }

    //añadir nodos
    public void add(String valor) {
        Nodo nuevo = new Nodo(valor);

        System.out.println(ruta);
        
        if (ruta == null) {
            ruta = nuevo;
            System.out.println(nuevo);
        } else {
            Nodo temp = ruta;
            Nodo actual;
            while (true) {
                actual = temp;
                int comparar = valor.compareTo(temp.getRaiz());
                if (comparar <= 0) {
                    if (comparar == 0) {
                        System.out.println("NUMEROS IGUALES");
                    }
                    temp = temp.getIzquierda();
                    if (temp == null) {
                        actual.setIzquierda(nuevo);
                        return;
                    }
                } else {
                    temp = temp.getDerecha();
                    if (temp == null) {
                        actual.setDerecha(nuevo);
                        return;
                    }
                }
            }
        }
    }
    //llama a nodo
    public void callDelete(String valor) {
        delete(ruta);
    }
    //elimina nodo
    public void delete(Nodo actual) {
        if (actual != null) {
            System.out.print("[" + actual.getRaiz() + "]");
            delete(actual.getIzquierda());
            delete(actual.getDerecha());
        }

        return;
        /*Nodo actual = nodo;
        Nodo nodoIzquierda = nodo.getIzquierda();
        Nodo nodoDerecha = nodo.getDerecha();
        System.out.println(nodo.getRaiz());
        System.out.println(actual.getRaiz());

        System.out.println(actual.getIzquierda().getRaiz());
        System.out.println(actual.getDerecha().getRaiz());

        if (actual != null) {
            if (actual.getRaiz().compareToIgnoreCase(valor) == 0) {
                System.out.println("iguales");

                if (nodoIzquierda != null) {
                    nodoIzquierda.setDerecha(nodoDerecha);
                }

                if (nodoDerecha != null) {
                    nodoDerecha.setIzquierda(nodoIzquierda);
                }
                return;
            }

            if (actual.getIzquierda() != null) {
                delete(actual.getIzquierda(), valor);
            }

        }

        return;*/
    }

    public void printPreOrder() {
        preOrder(ruta);
    }

    public void printInOrder() {
        inOrder(ruta);
    }

    public void printPostOrder() {
        postOrder(ruta);
    }
    //imprimir preorden
    private void preOrder(Nodo actual) {
        if (actual != null) {
            System.out.print("[" + actual.getRaiz() + "]");
            preOrder(actual.getIzquierda());
            preOrder(actual.getDerecha());
        }
    }
    //imprimir inorden
    private void inOrder(Nodo actual) {
        if (actual != null) {
            inOrder(actual.getIzquierda());
            System.out.print("[" + actual.getRaiz() + "]");
            inOrder(actual.getDerecha());
        }
    }
    //imprimir postorden
    private void postOrder(Nodo actual) {
        if (actual != null) {
            postOrder(actual.getIzquierda());
            postOrder(actual.getDerecha());
            System.out.print("[" + actual.getRaiz() + "]");
        }
    }
}
