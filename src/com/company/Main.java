package com.company;

public class Main {

    public static void main(String[] args){
        String resultado = "";
        String[] nombres = {"Juan", "Pedro", "Rafael"};
        for(String nombre : nombres){
            resultado += nombre + " ";
        }
        System.out.println(resultado);
    }

}
