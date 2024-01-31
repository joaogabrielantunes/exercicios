package org.example;

import java.lang.System;

public class ExercicioIdade {

    int idade;

    public void imprimir(){
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de idade");
        }
    }

    public static void main(String[] args) {

        ExercicioIdade idade = new ExercicioIdade();

        idade.idade = 17;

        idade.imprimir();
    }
}
