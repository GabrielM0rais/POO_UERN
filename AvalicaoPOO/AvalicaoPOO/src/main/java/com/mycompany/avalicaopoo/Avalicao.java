/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

/**
 *
 * @author Gabriel Morais
 */
public class Avalicao {
    private int id, nota;
    private String name, comentario;
    
    public Avalicao(int id, String name, int nota, String comentario){
        this.id = id;
        this.nota = nota;
        this.name = name;
        this.comentario = comentario;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public int getNota() {
        return this.nota;
    }
    
    public String getName() {
        return this.name;
    }
    
    
}
