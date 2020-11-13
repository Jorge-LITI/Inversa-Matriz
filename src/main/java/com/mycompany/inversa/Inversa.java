/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inversa;
     import java.util.Scanner;

/**
 *
 * @author Jorge Licea
 */
public class Inversa 
{
//@author Jorge Licea
//@author Luis Hernandez
//@author Oscar Morales

    public static void main(String [] args)
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Numero de filas ");
        int fil=leer.nextInt();
        System.out.println("Numero de columnas ");
        int col=leer.nextInt();
        
//crear  objeto Matriz
        Proceso mat=new Proceso(fil,col);
        
        mat.Pedir();
      //  mat.Licea();
        
    }
}    

