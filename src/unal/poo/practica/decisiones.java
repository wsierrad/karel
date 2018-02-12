/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;

/**
 *
 * @author ESTUDIANTE
 */
public class decisiones {
    public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("decisiones.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
           
            do{
                mover(1);
                int c=recoger();
                estudiante.turnLeft();
                poner(c);
                giro(2);
                mover(c);
                giro(1);
            }while(estudiante.canPickThing());
                  
        }
        
        public static int recoger(){
            int c=0;
            while(estudiante.canPickThing()){
                estudiante.pickThing();
                c++;
            }
            return c;
        }
        
        public static void poner(int a){
            for(int i=a;i>0;i--){
                estudiante.putThing();
                estudiante.move();
            }
        }
        public static void mover(int pasos){
            for (int i = 0; i < pasos; i++) 
                estudiante.move();
        }
        public static void giro(int giros){
            for (int i = 0; i < giros; i++) 
                estudiante.turnLeft();
        }
}
