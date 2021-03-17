/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Avaliations;

/**
 *
 * @author Gabriel Morais
 */
public class Opinioes {
    private Avaliations[] arrAvalicoes;
    
    public Opinioes(Avaliations[] arrAvalicoes) {
        this.arrAvalicoes = arrAvalicoes;
    }
    
    public void setAvalicoes(Avaliations[] arrAvalicoes) {
        this.arrAvalicoes = arrAvalicoes;
    }
    
    public int avarageAvaliations(int id) {
        int sum = 0, count = 0, i = 0;
     
        while (i < arrAvalicoes.length) {
            if (arrAvalicoes[i].getId() == id) {
                sum += arrAvalicoes[i].getNota();
                count += 1;
            } 
            i++;
        }
        
        return sum/count;
    }
    
    public int largeAvaliation(int id) {
        int large = -1;
        int i = 0;
        
         while ( i < arrAvalicoes.length) {
            if (arrAvalicoes[i].getId() == id) {
                if (arrAvalicoes[i].getNota() > large) {
                    large = arrAvalicoes[i].getNota();
                }
            }
            i++;
        }
        
        return large;
    }
    
    public int smallerAvaliotions(int id) {
        int smaller = 5; 
        int i = 0;
        
        while ( i < arrAvalicoes.length) {
            if (arrAvalicoes[i].getId() == id) {
                if (arrAvalicoes[i].getNota() < smaller) {
                    smaller = arrAvalicoes[i].getNota();
                }
            }
            i++;
        }
        return smaller;
    }
}
