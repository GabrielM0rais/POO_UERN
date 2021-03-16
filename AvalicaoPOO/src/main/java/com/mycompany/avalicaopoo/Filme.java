/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avalicaopoo;

import java.util.Random;

/**
 *
 * @author Gabriel Morais
 */
public class Filme {
    private int id;
    private String name, gen, description;
    
    public Filme(int id, String name, String gen, String description){
        this.id = id;
        this.name = name;
        this.gen = gen;
        this.description = description;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGen(String gen){
        this.name = gen;
    }
    
    public void setDescription(String description){
        this.name = description;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getGen(){
        return this.gen;
    }
    
    public String getDescription(){
        return this.description;
    }
}