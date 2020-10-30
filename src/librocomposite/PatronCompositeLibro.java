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
public class PatronCompositeLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComponenteLibro libroTerror=new Libro("IT","PAYASO ASESINO");
        ComponenteLibro libroFantasia=new Libro("BIBLIA","GENOCIDIO ");
        ComponenteLibro libroSuspenso=new Libro("EL ELEVADOR","EN EL HOTEL ESTAN PASANDO COSAS MUY RARAS");
        libroTerror.add(new ElementoTema("escuela ep 1", "la trama se desarrolla en una escuela",  25));
        libroTerror.add(new ElementoTema("alcantarillas ep 2", "buscan al pasayo en las alcantarillas",150));
        libroFantasia.add(new ElementoTema("genesis capitulo 1", "gran imaginacion ", 200));
        libroFantasia.add(new ElementoTema("genesis capitulo 2", "es una gran historia ",250));
        libroSuspenso.add(new ElementoTema("bsucando el hotel ", "dirigiendose a un lugar lejos de la ciudad",125));
        libroSuspenso.add(new ElementoTema("escapando del hotel", "quedan atrapados y buscan una salida", 100));
        ComponenteLibro todosLosLibros=new Libro("Todos los libros","todos los libros adquiridos");
        todosLosLibros.add(libroTerror);
        todosLosLibros.add(libroFantasia);
        todosLosLibros.add(libroSuspenso);
        Indice indice=new Indice(todosLosLibros);
        indice.printMenu();
        
        
        
    }
    
}
