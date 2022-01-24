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
public class Nodo {
    private String raiz;
    private Nodo derecha;
    private Nodo izquierda;
    
    
    public Nodo(){
        this.derecha = null;
        this.izquierda = null;
    }
    public Nodo(String raiz){
        this.raiz = raiz;
        this.derecha = null;
        this.izquierda = null;
    }
    
    public String getRaiz() {
        return raiz;
    }
    public void setDato(String raiz) {
        this.raiz = raiz;
    }
    public Nodo getDerecha() {
        return derecha;
    }
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public Nodo getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }  
}
