/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.entidades;

import java.text.DecimalFormat;


/**
 *
 * @author Alan
 */
public class Reserva  /*extends Hospede*/{
    DecimalFormat df = new DecimalFormat("0.00");
    private int codigo;
    private int quantDias;
    private double valorDiaria;
    private double total;
    private double desconto;

    public Reserva(int codigo, int quantDias, double valorDiaria, double total, double desconto) {
        this.codigo = codigo;
        this.quantDias = quantDias;
        this.valorDiaria = valorDiaria;
        this.total = total;
        this.desconto = desconto;
        codigo = 1;
    
    }

    
    
    /*public void infoReserva(Reserva reserva){
        reserva.codigo = 1;
        reserva.valorDiaria = 300;
        double desconto = 15.0/100.0;
        double total = reserva.valorDiaria * reserva.quantDias;
        System.out.println("Código: "+ reserva.codigo);
        if(reserva.quantDias > 7){
            System.out.println("Desconto de 15%");
            total = total + (desconto * total); 
        }
        System.out.println("Noite(s): "+quantDias+ "Diárias: "+ reserva.quantDias+ " - "+"Total: "+ df.format(total));
    }*/

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Noites: "+ quantDias+ "\nValor Diária: " +df.format(valorDiaria)+ "\nValor total: "+ df.format(total);
    }
}

