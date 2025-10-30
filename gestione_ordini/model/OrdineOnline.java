/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.model;

/**
 *
 * @author david
 */
public class OrdineOnline extends Ordine {

    private String indirizzoDiSpedizione;

    public String getIndirizzoDiSpedizione() {
        return indirizzoDiSpedizione;
    }

    public void setIndirizzoDiSpedizione(String indirizzoDiSpedizione) {
        this.indirizzoDiSpedizione = indirizzoDiSpedizione;
    }

    @Override
    public boolean mostraDettagli() {
        System.out.println("ORDINE NEGOZIO:");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Importo: " + getImporto());
        return true;
    }

    @Override
    public String toString() {
        return "OrdineOnline{"
                + "indirizzoDiSpedizione = " + indirizzoDiSpedizione
                + "id = " + getId() + ""
                + "Cliente = " + getCliente() + ""
                + "Importo = " + getImporto() + ""
                + "Consegnato = " + isConsegnato() + ""
                + '}';
    }

}
