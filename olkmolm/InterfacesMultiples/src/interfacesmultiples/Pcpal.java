/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmultiples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juana García
 */
public class Pcpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List <Edificio> listaEdificios = new ArrayList <> ();
        Edificio poli1 = new Polideportivo (180.6, 25.7, "Municipal", "Techado");
        Edificio poli2 = new Polideportivo (205.8, 52, "Central", "Abierto");
        Edificio poli3 = new Polideportivo (190, 32, "Recrearte", "Techado");
        Edificio edi1 = new EdificioDeOficinas (52, 17.2, 55, 10);
        Edificio edi2 = new EdificioDeOficinas (109, 153.2, 290, 5);
        listaEdificios.add(poli1); listaEdificios.add(poli2); listaEdificios.add(poli3);
        listaEdificios.add(edi1); listaEdificios.add(edi2);
        Iterator <Edificio> it = listaEdificios.iterator ();
        while (it.hasNext()) {
            Edificio tmp = it.next();
            System.out.println (tmp.toString());
        }
    }
    }
    
// --> hash() avanza
// --> hashN:ext(): verifica si hay algo mas en lo siguiente
// --> Remove Elimina 
// --> Array nums [1,2,3...]
// --> fill: agrega
// --> add
// --> sort: ordenar ascendente 

// Dado (6)
// Lados {1,2,3,4,5,6}

/*
Random
Cara Frecuencia
1-------10
2-------8
3-------6
4-------9
5-------11
6-------21
*/
/*
Clases de objeto
*/