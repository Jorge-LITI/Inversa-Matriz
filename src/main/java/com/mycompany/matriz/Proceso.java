package com.mycompany.matriz;
import java.util.Scanner;

public class Proceso 
{
    int fil;
    int col;
    double Mat[][];
    Scanner leer=new Scanner(System.in);
    public Proceso(int fil,int col)
    {
        this.fil=fil;
        this.col=col;
        Mat=new double [fil][col];
    }
    
    public void Pedir()
    {
        for(int i=0;i<fil;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("["+(i+1)+"]"+"["+(j+1)+"]: ");
                Mat[i][j]=leer.nextDouble();
            }
        }
    }
    public void imprimir()
    {
        for(int i=0;i<fil;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(Mat[i][j]+" |");
            }
             System.out.println();
        }
    }
    public void signo()
    {
        for(int i=0;i<fil;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(Mat[i][j]%2==0)
                {
                    System.out.println("+");
                }
                else
                {
                    System.out.println("-");
                }
            }
        }
    }
    public void nombres()
    {
        System.out.println("Hernandez Granados Luis Fernando");
        System.out.println("heeeeeeeeeeeeeeeloo");
        System.out.println("Hola jorge Xd como estas?");
            
    }
    
}

