/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.entidades;

import java.util.Date;

/**
 *
 * @author Alan
 */
public class Hospede {
    private int adulto;
    private int infantil;
    private String nomeCrianca;
    private String nomeAdulto;
    private String endereco;
    private int idadeAdulto;
    private int idadeCrianca;

    public Hospede(int adulto, int infantil, String nomeCrianca, String nomeAdulto, String endereco, int idadeAdulto, int idadeCrianca) {
        this.adulto = adulto;
        this.infantil = infantil;
        this.nomeCrianca = nomeCrianca;
        this.nomeAdulto = nomeAdulto;
        this.endereco = endereco;
        this.idadeAdulto = idadeAdulto;
        this.idadeCrianca = idadeCrianca;
    }

    public Hospede(int infantil, String nomeCrianca, int idadeCrianca) {
        this.infantil = infantil;
        this.nomeCrianca = nomeCrianca;
        this.idadeCrianca = idadeCrianca;
    }

    public int getAdulto() {
        return adulto;
    }

    public void setAdulto(int adulto) {
        this.adulto = adulto;
    }

    public int getInfantil() {
        return infantil;
    }

    public void setInfantil(int infantil) {
        this.infantil = infantil;
    }

    public String getNomeCrianca() {
        return nomeCrianca;
    }

    public void setNomeCrianca(String nomeCrianca) {
        this.nomeCrianca = nomeCrianca;
    }

    public String getNomeAdulto() {
        return nomeAdulto;
    }

    public void setNomeAdulto(String nomeAdulto) {
        this.nomeAdulto = nomeAdulto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdadeAdulto() {
        return idadeAdulto;
    }

    public void setIdadeAdulto(int idadeAdulto) {
        this.idadeAdulto = idadeAdulto;
    }

    public int getIdadeCrianca() {
        return idadeCrianca;
    }

    public void setIdadeCrianca(int idadeCrianca) {
        this.idadeCrianca = idadeCrianca;
    }

    
    
    public String toString(){
        return "Cadastro: \nAdulto(s): "+ adulto+"\nNome: "+nomeAdulto;
    }
    
   

    /*public void cadastro(Hospede hospede){
         System.out.println("Cadastro realizado!!");
         System.out.println("Hóspede: "+ hospede.nome + " - "+ "Endereço: "+hospede.endereco);
    }*/
}
