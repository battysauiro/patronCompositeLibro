/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librocomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Oscar
 */
public class Libro extends ComponenteLibro{
    ArrayList<ComponenteLibro>libroComponentes=new ArrayList();
    private String titulo;
    private String texto;
    private int  total=0;
    
   public Libro(String titulo,String texto){
       this.titulo=titulo;
       this.texto=texto;
   }
   
    @Override
    public void add(ComponenteLibro librocomponente){
        if(libroComponentes.indexOf(librocomponente)==-1)libroComponentes.add(librocomponente);
    }
    @Override
    public void remove(ComponenteLibro librocomponente){
        if(libroComponentes.indexOf(librocomponente)!=1)libroComponentes.remove(librocomponente);
    }
    @Override
    public ComponenteLibro getHijo(int i){
        if(!libroComponentes.isEmpty()){
            if(i>=0 && i<libroComponentes.size()){
                return (ComponenteLibro)libroComponentes.get(i);
            } 
        }
        throw new UnsupportedOperationException();
    }
    @Override
    public String getTitulo(){
        return titulo;
    }
    @Override
    public String getTexto(){
        return texto;
    }
    
    
    @Override
    public boolean esHijo(){
        return false;
    }
    
    @Override
    public int getNumPagTotal(){
 
        Iterator iterator =libroComponentes.iterator();
        while(iterator.hasNext()){
            ComponenteLibro libroComponentes=(ComponenteLibro)iterator.next();
            if(libroComponentes.esHijo())
            {//)System.out.println("aquiiiiiiii "+menuComponentes.getPrecio());
                total+=libroComponentes.getNumPag();
            }
        }
        return total;
    }
    
    @Override
    public void print(){
        System.out.print("\n"+getTitulo());
        System.out.println(", "+getTexto());
        System.out.println("----------------------------");
        Iterator iterator =libroComponentes.iterator();
        while(iterator.hasNext()){
            ComponenteLibro libroComponentes=(ComponenteLibro)iterator.next();
            libroComponentes.print();
        }
        System.out.println("paginas totales: "+getNumPagTotal());
    }
    
    
    
}
