package librocomposite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Indice {
    ComponenteLibro todosLosLibros;
    
    public Indice(ComponenteLibro todosLosLibros){
        this.todosLosLibros=todosLosLibros;
    }
    
    public void printMenu(){
        todosLosLibros.print();
    }
}
