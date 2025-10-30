/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.model;

/**
 *
 * @author david
 */
public class OrdineInNegozio extends Ordine {

    private String puntoVendita;

    public String getPuntoVendita() {
        return puntoVendita;
    }

    public void setPuntoVendita(String puntoVendita) {
        this.puntoVendita = puntoVendita;
    }

    @Override
    public boolean mostraDettagli() {
        System.out.println("ORDINE NEGOZIO:");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Importo: " + getImporto());
        System.out.println("Punto vendita: " + puntoVendita);
        return true;
    }

    @Override
    public String toString() {
        return "OrdineInNegozio{"
                + "puntoVendita = " + puntoVendita
                + "id = " + getId() + ""
                + "Cliente = " + getCliente() + ""
                + "Importo = " + getImporto() + ""
                + "Consegnato = " + isConsegnato() + ""
                + '}';
    }

}
