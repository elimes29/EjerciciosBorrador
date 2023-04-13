/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decvariables;
    import java.util.Scanner; //Importando sacanner

/**
 *
 * @author usuario
 */
public class Decvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte enteroPeq=10;
        enteroPeq++;
        short enteroMed=-1000;
        int enteroNrm=10000000;
        int suma=enteroMed+enteroPeq;
        long enteroGrd=0000012542;
        float realPeq=125182;
        float resta=enteroGrd-realPeq;
        double realGrd=1254845.21546;
        double division=(double)enteroNrm/enteroPeq;
        float modulo=enteroNrm%3;
        boolean buleano=false;
        char caracter='d';
        boolean dif=enteroPeq==enteroNrm;
        String cadenaTxt="Elimes";
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println(enteroPeq);
        System.out.println(cadenaTxt + " LOCURA");
        cadenaTxt="Hola";
        System.out.println(cadenaTxt);
        
        //LEER VALORES
        Scanner leer = new Scanner(System.in);
        
        //LEER VALORES CADENAS de Texto
        System.out.println("Escribe tu nombre");
        String nombre=leer.nextLine();
        
        //LEER VALORES Enteros
        System.out.println("Escribe tu edad");
        int num=leer.nextInt();
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + num);

    }
    
}
