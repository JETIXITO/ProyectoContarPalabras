/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import java.util.Scanner;

public class InicioApp {

    static final String TEXTO_PEDIR_CADENA = "Introduzca un conjunto de caracteres:";

    public static void main(String[] args) {

        InicioApp ia = new InicioApp();
        Scanner scan = new Scanner(System.in);
        System.out.println(TEXTO_PEDIR_CADENA);
        String cadena = scan.nextLine();
        PintarResultados.textoCaracteresTotal(ContarPalabras.contarCaracteresTotal(cadena));
        PintarResultados.textoNumeroPalabras(ContarPalabras.contarNumerosPalabras(cadena));
        PintarResultados.textoTodosCaracteres(ContarPalabras.contarTodosCaracteres(cadena));
        scan.close();

    }

}
