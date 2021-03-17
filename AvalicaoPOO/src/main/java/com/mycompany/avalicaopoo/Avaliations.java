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
public class Avaliations {
    private int id, nota;
    private String name, comment;
    
    public Avaliations(int id, String name, int nota, String comment){
        this.id = id;
        this.nota = nota;
        this.name = name;
        this.comment = comment;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getNota() {
        return this.nota;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getComment() {
        return this.comment;
    }
}
