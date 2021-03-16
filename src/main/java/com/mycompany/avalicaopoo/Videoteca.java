/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Filme;
      
/**
 *
 * @author Gabriel Morais
 */
public class Videoteca {
    private Filme[] arrFilms;
    
    public Videoteca(Filme[] arrFilms) {
        this.arrFilms = arrFilms;
    }
    
    public void setFilmes(Filme[] arrFilms) {
        this.arrFilms = arrFilms;
    }
    
    public Filme[] getFilmes() {
        return this.arrFilms;
    }
    
    public int getByString(String string) {
        for(int i=0; i<arrFilms.length; i++){
            if (arrFilms[i].getName().contains(string) || 
                    arrFilms[i].getDescription().contains(string) ){
                return i;
            }
        }
        return -1;
    }
    
    public String[] getNamesFilmes() {
        String[] names = new String[arrFilms.length];
        
        for( int i = 0; i < arrFilms.length; i++) {
            names[i] = arrFilms[i].getName();
        }
        
        return names;
    }
}
