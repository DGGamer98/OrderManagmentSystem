/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.Exception;

import com.mycompany.gestione_ordini.model.Ordine;

/**
 *
 * @author david
 */
public class OrdineNonTrovatoException extends Exception {
    
    int id;

    public OrdineNonTrovatoException(int x) {
        id = x;
    }

    @Override
    public String toString() {
        return "OrdineNonTrovatoException{"
                + "ordine = " + id
                + '}';
    }

}
