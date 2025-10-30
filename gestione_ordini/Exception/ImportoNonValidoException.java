/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.Exception;

/**
 *
 * @author david
 */
public class ImportoNonValidoException extends Exception {

    double prezzo;

    public ImportoNonValidoException(double prezzoProdotto) {
        prezzo = prezzoProdotto;
    }

    @Override
    public String toString() {
        return "ImportoNonValidoException{" 
                + "prezzo = " + prezzo
                + '}';
    }

}
