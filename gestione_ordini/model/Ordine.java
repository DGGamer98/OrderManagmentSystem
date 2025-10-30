/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.model;

/**
 *
 * @author david
 */
public abstract class Ordine {

    private int id;
    private String cliente;
    private double importo;
    private boolean consegnato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public boolean isConsegnato() {
        return consegnato;
    }

    public void setConsegnato(boolean consegnato) {
        this.consegnato = consegnato;
    }
    
    public abstract boolean mostraDettagli();
    
    @Override
    public String toString() {
        return "Ordine{"
                + "id =" + id
                + ", cliente = " + cliente
                + ", importo = " + importo
                + ", consegnato = " + consegnato
                + '}';
    }

}
