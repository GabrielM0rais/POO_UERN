/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Avalicao;

/**
 *
 * @author Gabriel Morais
 */
public class Opnioes {
    private Avalicao[] arrAvalicoes;
    private int soma, maior, menor;
    
    public Opnioes(Avalicao[] arrAvalicoes) {
        this.arrAvalicoes = arrAvalicoes;
    }
    
    public void setAvalicoes(Avalicao[] arrAvalicoes) {
        this.arrAvalicoes = arrAvalicoes;
    }
    
    public int mediaAvaliacoes() {
        for (int i = 0; i < arrAvalicoes.length; i ++) {
            this.soma+= arrAvalicoes[i].getNota();
        }
        
        return this.soma/arrAvalicoes.length;
    }
    
    public int maiorAvalicao() {
        for(int i = 0; i < arrAvalicoes.length; i++) {
            if (i == 0) {
                this.maior = arrAvalicoes[i].getNota();
            }
            if (arrAvalicoes[i].getNota() > maior) {
                this.maior = arrAvalicoes[i].getNota();
            }
        }
        return this.maior;
    }
    
    public int menorAvalicao() {
        for(int i = 0; i < arrAvalicoes.length; i++) {
            if (i == 0) {
                this.menor = arrAvalicoes[i].getNota();
            }
            if (arrAvalicoes[i].getNota() < maior) {
                this.menor = arrAvalicoes[i].getNota();
            }
        }
        return this.menor;
    }
}
