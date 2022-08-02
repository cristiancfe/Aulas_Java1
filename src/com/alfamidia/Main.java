package com.alfamidia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o peso em kg: ");
        float peso = entrada.nextFloat();

        System.out.println("Entre com sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura *altura);

        System.out.print("o imc e : " + imc);

        String classificacao = "";

        if(imc < 18.5) classificacao = "Magreza";
        else if(imc > 18.5 && imc < 24.9) classificacao = "Normal";
        else if(imc > 24.9 && imc < 29.9) classificacao = "Sobrepeso";
        else if(imc >29.9) classificacao = "Obesidade";
        else classificacao = "Obesidade Grave";

        System.out.println(("A classificacao e: " + classificacao));
    }
}
