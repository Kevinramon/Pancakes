/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.uac.Grafo;
import java.uac.GrafoCol;
import java.uac.LimiteException;

/**
 *
 *
 */
public class GrafoEnteros {
    public Grafo<Integer> crear() throws LimiteException{
        Grafo<Integer> g = new GrafoCol<>();
        for (int i = 0; i < 5; i++) {
            g.insVertice(i);
        }
        g.insArco(0, 1, 1);
        g.insArco(0, 3, 22);
        g.insArco(0, 4, 9);
        
        g.insArco(1, 2, 20);
        
        g.insArco(2, 0, 12);
        g.insArco(2, 3, 15);
        
        g.insArco(3, 1, 4);
        g.insArco(3, 4, 7);
        
        g.insArco(4, 1, 5);
        g.insArco(4, 0, 4);
        
        return g;
    }
    
    public String mostrar(Grafo<Integer> g) throws LimiteException{
        String con ="";
        for (int i = 0; i < g.ordenGrafo(); i++) {
            con+=" Vert "+g.infoVertice(i);
            for (int j = 0; j < g.ordenGrafo(); j++) {
                con+= " "+g.costoArco(i, j);
            }
            con+="\n";
        }
        return con;
    }
    
    public static void main(String[] args) throws LimiteException {
        GrafoEnteros g=new GrafoEnteros();
        System.out.println(" "+g.mostrar(g.crear()));
    }
}
