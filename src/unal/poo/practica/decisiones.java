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
            objetos = new City("Patron.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            for(int i=5;i>0;i--){
                for (int j=2;j>0;j--){
                RobotBase.mover(i);
                giro(3);
                }
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
