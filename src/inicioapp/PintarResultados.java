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
public class PintarResultados {
    
    static int palabras=1;
    static int numCaracteresSinBlancos = 0;
    static final String TEXTO_LETRAS= "Las letras que se repiten son:";
    static final String TEXTO_PALABRAS= "Se han ingresado ";
    static final String TEXTO_FINAL_PALABRAS= " palabras.";
    static final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
    static final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
    
        static String textoCaracteresTotal(int total){
            System.out.println(TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS);
            return null;
        }
        
        static String textoNumeroPalabras(int total){
            System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
            return null;
        }
        
        static String textoTodosCaracteres(int [] contador){
            System.out.println(TEXTO_LETRAS);
		for (int i = 0;i<contador.length;i++) { //Recorro el array y muestro todo.
                        char letra = (char) i;
			if (contador[i]>0 && letra != ' ') {
				if (contador[i]==1)
					System.out.println(""+letra+ "-->" + contador[i] + " vez.");
				else
					System.out.println(""+letra+ "-->" + contador[i] + " veces.");
                }
                        
            }
            return null;
        }
    
}
