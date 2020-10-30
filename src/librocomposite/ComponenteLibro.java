/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librocomposite;

/**
 *
 * @author Oscar
 */
public abstract class ComponenteLibro {
    
    public void add(ComponenteLibro menucomponente){
        throw new UnsupportedOperationException();
    }
    public void remove(ComponenteLibro menucomponente){
        throw new UnsupportedOperationException();
    }
    
    public ComponenteLibro getHijo(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getTitulo(){
        throw new UnsupportedOperationException();
    }
    
    public String getTexto(){
        throw new UnsupportedOperationException();
    }
 
    public int getNumPag(){
        throw new UnsupportedOperationException();
    }
    
    public int getNumPagTotal(){
        throw new UnsupportedOperationException();
    }
    public boolean esHijo(){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
    
}
