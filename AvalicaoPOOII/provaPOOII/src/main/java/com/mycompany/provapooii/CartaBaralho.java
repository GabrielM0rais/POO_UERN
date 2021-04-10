/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provapooii;

import javax.swing.ImageIcon;

/**
 *
 * @author sebastiao
 */
public class CartaBaralho {
    private Carta carta;
    private Naipe naipe;
    private ImageIcon imagemCarta;

    public CartaBaralho(Carta carta, Naipe naipe, String imagemCarta) {
        this.carta = carta;
        this.naipe = naipe;
        this.imagemCarta = new ImageIcon("/images/" + imagemCarta + ".png");
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
    public ImageIcon getImage() {
        return imagemCarta;
    }
    
    
    public static CartaBaralho [] geraBaralho (){
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        CartaBaralho baralho [] = new CartaBaralho[tamanhoBaralho];
        int idx = 0;
        for (Naipe naipe : Naipe.values()){
            for(Carta carta : Carta.values()){
                String nomeImagem = carta.getNome() + " " + naipe.getNome();
                baralho [idx++] = new CartaBaralho(carta, naipe, nomeImagem);
            }
        } 
       return baralho;
    }
       
    public static void main(String[] args) {
        CartaBaralho meuBaralho [] = CartaBaralho.geraBaralho();
        for(CartaBaralho minhaCarta : meuBaralho) {
            System.out.println (minhaCarta.getCarta().getNome() + " de " +
                    minhaCarta.getNaipe().getNome());
        }
    }
    
}
