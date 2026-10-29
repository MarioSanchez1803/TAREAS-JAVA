/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author msanr
 */
public class LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


/*int [] goles={7,5,10};

int totalgoles=0;
                //FOR PARA RECORRER
          for (int i = 0; i < goles.length; i++) {
          totalgoles= totalgoles+goles[i];
        }
       
           

   System.out.println(totalgoles+" total de goles");*/
       


/*int [] golesPayo={1,5,2,4,3};
int cont=0;
        for (int i = 0; i < golesPayo.length; i++) {
            if(golesPayo[i]>=3){
                 cont++;
            }    
        }
        System.out.println("El equipo ha goleado en "+cont+" partidos");*/

/*int [] goles={2,0,4,7,1,3};
int mayor=0;
        
        for (int i = 0; i < goles.length; i++) {
            if(goles[i]>=mayor){
                mayor=goles[i];
            }
        }
        System.out.println("La mayor goleada del Payo Cayetano fue de "+mayor+" goles.");*/


/*double [] nota={4.5, 8.9, 10.0, 7.6, 5.0};
double notamax=0;
double notamin=0;
int numaprobado=0;
int numsuspenso=0;
        for (int i = 0; i < nota.length; i++) {
            if(nota[i]>=notamax){
                notamax=nota[i];
            }
            if(nota[i]<=4.5){
                notamin=nota[i];
            }
            if(nota[i]<5){
                numsuspenso++;
            } else{
                numaprobado++;
            }
           
        }

        System.out.println(notamax+ " ha sido la nota maxima");
        System.out.println(notamin+" ha sido la nota minima");
        System.out.println(numaprobado+ " han aprobado");
        System.out.println(numsuspenso+" han suspendido");*/


/*int [] minutosJugados={50, 25, 50, 40, 50, 15, 50};
int partidoCompleto=0;
int suma=0;
        for (int i = 0; i < minutosJugados.length; i++) {
            if(minutosJugados[i]==50){
                partidoCompleto++;
            }
            if(minutosJugados[i]==15){
                minutosJugados[i]=30;
            }
          
            suma=suma+minutosJugados[i];
        }
        System.out.println(partidoCompleto+" jugadores han acabado un partido completo");
        System.out.println(Arrays.toString(minutosJugados));
        System.out.println(suma+" es el total de minutos disputados");
*/
Scanner sc=new Scanner (System.in);
System.out.println("Que dorsal buscas?");
        int dorsal=sc.nextInt();
int [] convo={1, 5, 28, 10, 22, 73, 9};
 boolean estaConvocado=false;
        for (int i = 0; i < convo.length; i++) {
            if(dorsal==1 || dorsal==28){
               estaConvocado=false;
            }else{
                estaConvocado=true;
            }
        }
        System.out.println(estaConvocado);
        }

    }
    

