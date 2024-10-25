/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melendez_reyna_lab2_control;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class menu_principal {
    public static void main(String[] args) {
        int opciones = 0;
        Scanner entrada=new Scanner(System.in);
        
        opciones=Integer.parseInt(JOptionPane.showInputDialog("Favor seleccionar Opcion:\n"
        + "1.Cadena\n"
        + "2.Notas\n"
        + "3.Clases\n"
        + "4. Salir"))   ;  
        
        switch(opciones){
            case 1:
                
              
                break;
            case 2:
                int cantidadnotas;
                float mayor=0, menor=0 ;

                cantidadnotas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas"));
                float nota1=Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
                while (nota1<0 || nota1>100) {
                 JOptionPane.showMessageDialog(null, "Error debe de ingresar un numero entre 0 y 100");
                 nota1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota1 nuevamente"));
                }

                float nota2 =Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
                while (nota2<0 || nota2>100) {
                 JOptionPane.showMessageDialog(null, "Error debe de ingresar un numero entre 0 y 100");
                 nota2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 2 nuevamente"));
                }
                float nota3=Float.parseFloat(JOptionPane.showInputDialog("Nota 3"));
                while (nota3<0 || nota3>100) {
                 JOptionPane.showMessageDialog(null, "Error debe de ingresar un numero entre 0 y 100");
                 nota3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 3 nuevamente"));
                }
                float nota4=Float.parseFloat(JOptionPane.showInputDialog("Nota 4"));
                while (nota4<0 || nota4>100) {
                 JOptionPane.showMessageDialog(null, "Error debe de ingresar un numero entre 0 y 100");
                 nota4=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota 4 nuevamente"));
                }

                float promedio= ((nota1+nota2+nota3+nota4)/cantidadnotas) ;
                float [] notas={nota1,nota2,nota3,nota4};
                for (int i = 0; i < notas.length; i++) {
                  if (notas[i]>mayor){
                      mayor=notas[i];
                  }}
                JOptionPane.showMessageDialog(null,"El promedio es: "+String.format("%.2f",promedio)+"\n"
                        + "La nota mayor es: "+mayor+"\nLa nota menor es de: "+menor);
                break;
            case 3 :
            
              String dia=JOptionPane.showInputDialog("Ingrese el dia");
              
                break;
            case 4 :
            
           
                break;
                
                    
                
        
    
        }}}