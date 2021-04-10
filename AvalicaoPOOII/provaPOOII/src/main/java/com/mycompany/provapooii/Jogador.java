/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provapooii;

/**
 *
 * @author Gabriel Morais
 */
public class Jogador {
    
    private static final int CARTAS = 5;
    private final String nome;
    private final String vetor[];
    private int pontos;

    public Jogador(String nome, String[] vetor) {
        this.nome = nome;
        this.vetor = vetor;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String[] getVetor() {
        return vetor;
    }
    
    public int getPontos() {
        return pontos;
    }
    
    public void adicionarPontuacao(Carta[] cartas) {
        for(Carta carta: Carta.values())
            this.pontos += (int) carta.getPontos();
    }
    
}
