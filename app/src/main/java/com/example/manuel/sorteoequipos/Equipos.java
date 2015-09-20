package com.example.manuel.sorteoequipos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by manuel on 15/09/2015.
 */
public class Equipos {

    int NUM;
    ArrayList<String> numeros = new ArrayList<String>();

    public Equipos(int num){
        this.NUM = num;

        for(int i=0; i < this.NUM; i++)
            numeros.add(Integer.toString(i+1));

            }

    public String escribeNumero(){
        String numero;
        if(numeros.size()== 0)
            numero = "n";
        else {
            Random r = new Random();
            int number = r.nextInt(numeros.size());
           numero = numeros.get(number);
            numeros.remove(number);
        }

        return numero;

    }

}
