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
public class ElementoTema extends ComponenteLibro{
    private String titulo;
    private String texto;
    private int paginas;
    
    public ElementoTema(String titulo,String texto,int paginas){
    
        this.titulo=titulo;
        this.texto=texto;
        this.paginas=paginas;
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
    public int getNumPag(){
        return paginas;
    }
    
    
    @Override
    public void print(){
        System.out.print(" "+getTitulo());
        System.out.println(", "+getTexto());
        System.out.println("    -- "+getNumPag());
    }
    
    @Override
    public boolean esHijo(){
        return true;
    }
    
    
}
