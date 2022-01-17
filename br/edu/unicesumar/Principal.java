/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.unicesumar;

import br.edu.unicesumar.entidades.Hospede;
import br.edu.unicesumar.entidades.Quarto;
import br.edu.unicesumar.entidades.Reserva;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Alan
 * R.A: 1862886-5
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        
        Hospede hospede;
        Reserva reserva;
        Quarto quarto;
        
        System.out.println("Numero de Adultos: ");
        int num = sc.nextInt();
        System.out.println("Numero de crianças: ");
        int numCri = sc.nextInt(); 
        if(numCri >= 1){
            System.out.println("Nome da criança: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println();
            hospede = new Hospede(idade, nome, idade);
        }       
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Endereço: ");
        String endereco = sc.next();
        System.out.println("Idade: ");
        int idade = sc.nextInt();        
        hospede = new Hospede(num,numCri, nome, nome, endereco, idade, idade);
        
        System.out.println("Quantidade de dia(s): ");
        int dia = sc.nextInt();
        double valorDiaria = 300.0;
        double desconto = 15.0/100.0;
        double total = valorDiaria * dia;
        if(dia > 7){
            total = total + (desconto * total);
        }
        reserva = new Reserva(dia, dia, valorDiaria, total, desconto);
        
        int numero = 205;
        int capacidade = 3;
        System.out.println("Escolha a categoria: Simples[S] ou Luxo[L] ");
        String tipo = sc.next();
        if(tipo.equals("S")){
            tipo = "Simples";
        }else{
            tipo = "Luxo";
        }
        quarto = new Quarto(numero, capacidade, tipo);
        
        System.out.println();        
        System.out.println(hospede);
        System.out.println(quarto);
        System.out.println(reserva);
    }
    
}
