/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import java.util.Scanner;

public class InicioApp {

	int [] contador;
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public InicioApp(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}
	
        private int contarCaracteresTotal(String cadena){
            for (int i = 0;i<cadena.length();i++){ //recorro la cadena
			char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
			int ascii = car; //¿Esto qué es?
                        if (car != ' ') numCaracteresSinBlancos++; //Aumento el contador de caracteres no blancos
            }
            return numCaracteresSinBlancos;
        }
        
        private int contarNumerosPalabras(String cadena){
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
        
        private int[] contarTodosCaracteres(String cadena){
            for (int i = 0;i<cadena.length();i++){ //recorro la cadena
			char car = cadena.charAt(i); //obtengo el valor de la posición de i en la cadena
			int ascii = car; //¿Esto qué es?
                        contador[ascii]++; //añado uno al contador de ese caracter
                }
            return contador;
        }
	
        private String textoCaracteresTotal(int total){
            System.out.println(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
            return null;
        }
        
        private String textoNumeroPalabras(int total){
            System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
            return null;
        }
        
        private String textoTodosCaracteres(int [] contador){
            System.out.println(TEXTO_LETRAS);
		for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
			if (contador[i]>0 && letras[i] != ' ') {
				if (contador[i]==1)
					System.out.println(""+letras[i]+ "-->" + contador[i] + " vez.");
				else
					System.out.println(""+letras[i]+ "-->" + contador[i] + " veces.");
                }
                        
            }
            return null;
        }
        
	public static void main(String[] args) {
		InicioApp ia = new InicioApp();
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		ia.contarCaracteresTotal(cadena);
                ia.contarNumerosPalabras(cadena);
                ia.contarTodosCaracteres(cadena);
		ia.textoCaracteresTotal(ia.contarCaracteresTotal(cadena));
                ia.textoNumeroPalabras(ia.contarNumerosPalabras(cadena));
                ia.textoTodosCaracteres(ia.contarTodosCaracteres(cadena));
		scan.close();
		
	}

}
