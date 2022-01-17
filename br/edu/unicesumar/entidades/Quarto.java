/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.entidades;



/**
 *
 * @author Alan
 */
public class Quarto /*extends Hospede*/ {
    public int numero;
    public int capacidade;
    public String categoria;

    public Quarto(int numero, int capacidade, String categoria) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return "Suite "+ numero+ " - " + categoria;
    }
 }
