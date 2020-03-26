/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

/**
 *
 * @author Denis Marian Manta
 */
public class ContarPalabras {
    
    static int palabras=1;
    static int numCaracteresSinBlancos = 0;
    static int [] contador = new int[65536];
    
    static int contarCaracteresTotal(String cadena){
            for (int i = 0;i<cadena.length();i++){ //recorro la cadena
		char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
                if (car != ' '){ numCaracteresSinBlancos++;}//Aumento el contador de caracteres no blancos
            }
            return numCaracteresSinBlancos;
        }
        
        static int contarNumerosPalabras(String cadena){
            char car2 = ' ';
            for (int i = 0;i<cadena.length();i++){ //recorro la cadena
			char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
			int ascii = car; //¿Esto qué es?
                        if (car == ' ' && car2!=' ') { // Aumento el contador de palabras
				palabras++;
                }
                car2 = car;
            }
            return palabras;
        }
        
        static int[] contarTodosCaracteres(String cadena){
            for (int i = 0;i<cadena.length();i++){ //recorro la cadena
			char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
			int ascii = car; //¿Esto qué es?
                        contador[ascii]++; //añado uno al contador de ese caracter
                }
            return contador;
            
        }
        
}
