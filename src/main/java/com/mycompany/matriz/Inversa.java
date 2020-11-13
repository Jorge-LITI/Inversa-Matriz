package com.mycompany.matriz;
import java.util.Scanner;
public class Inversa
{
    //@author Jorge Licea
//@author Luis Hernandez
//@author Oscar Morales
     
     public static void Autores()
    {
        System.out.println("");
        System.out.println("Jorge Lice "  + "\nLuis Hernande" + "\nOscar Morales");
    }

    public static void main(String [] args)
    {
         Autores();
        Scanner leer=new Scanner(System.in);
        System.out.println("Numero de filas ");
        int fil=leer.nextInt();
        System.out.println("Numero de columnas ");
        int col=leer.nextInt();
        
//crear  objeto Matriz
        Proceso mat=new Proceso(fil,col);
        
        mat.Pedir();
        mat.imprimir();
        mat.signo();
        mat.imprimir();
        mat.nombres();
        
    }
    
}
