/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestione_ordini.Interface;

/**
 *
 * @author david
 */
public interface Gestibile<T> {
    
    void createOrder(T elemento);
    void leggi();
    void aggiorna(int id, T elemento);
    void elimina(int id);
}
